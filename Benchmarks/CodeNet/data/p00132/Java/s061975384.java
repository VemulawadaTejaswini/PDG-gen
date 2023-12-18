import java.util.ArrayList;
import java.util.Scanner;


public class Main {
	private	static	Scanner	m_stdin             = null;
	private			Board	m_board             = null;
	private			Board	m_pieces[]          = null;
	private			int		m_arrPieceLists[][] = null;

	static {
		m_stdin = new Scanner(System.in);
	}
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Main	main = new Main();
		while(true) {
			main.initBoard();
			if (main.isEnd()) {
				break;
			}
			main.initPiece();
			main.initPieceLists();
			main.mainProc();
		}
	}

    public void initBoard() {
    	m_board = createBoard();
	}

    public void initPiece() {
		// ピースの数を取得する
		String	szPieceMax = m_stdin.next();
		int 	nPieceMax  = Integer.parseInt(szPieceMax);

		// ピースのデータを取得する
		{
			m_pieces  = new Board[nPieceMax];
			for (int nPiece = 0; nPiece < nPieceMax; nPiece++) {
				m_pieces[nPiece] = createBoard();
			}
		}
	}

    private Board createBoard() {
    	Board	board = new Board();

		// 盤面のデータを取得する
		{
			String	szHeight  = m_stdin.next();
			String	szWidth   = m_stdin.next();
			int		nHeigth   = Integer.parseInt(szHeight);
			String	szBoard[] = new String[nHeigth];

			for (int nLoop = 0; nLoop < nHeigth; nLoop++) {
				szBoard[nLoop] = m_stdin.next();
			}

			board = new Board();
			board.init(szBoard);
		}

		return board;
    }

    public void initPieceLists() {
		// ピースリストの数を取得する
		String	szPieceListsMax = m_stdin.next();
		int 	nPieceListsMax  = Integer.parseInt(szPieceListsMax);

		// ピースのデータを取得する
		{
			m_arrPieceLists  = new int[nPieceListsMax][];
			for (int nPieceListsIndex = 0; nPieceListsIndex < nPieceListsMax; nPieceListsIndex++) {
				m_arrPieceLists[nPieceListsIndex] = createPieceList();
			}
		}
    }

    private int[] createPieceList() {
    	int		arrPieceList[] = null;

		// 盤面のリストの要素数を取得する
		{
			String	szPieceNum = m_stdin.next();
			int		nPieceNum  = Integer.parseInt(szPieceNum);

			if (nPieceNum > 0) {
				arrPieceList = new int[nPieceNum];
				for (int nLoop = 0; nLoop < nPieceNum; nLoop++) {
					String	szPieceNo   = m_stdin.next();
					arrPieceList[nLoop] = Integer.parseInt(szPieceNo);
				}
			}
		}

		return arrPieceList;
    }

	public void mainProc() {
		Board   piece     = null;
		int		nIndexMax = m_pieces.length;
		int		nWidth    = m_board.getWidth();
		int		nHeight   = m_board.getWidth();
		int		nListsMax = m_arrPieceLists.length;

		// 初期状態で各ピースを置けるパターンをチェック
		for(int nIndex = 0; nIndex < nIndexMax; nIndex++) {
			for(int nAngle = Board.ROTATE_ANGLE_0; nAngle <= Board.ROTATE_ANGLE_270; nAngle++) {
				piece = m_pieces[nIndex];
				piece.setAngle(nAngle);
				for(int nY = 0; nY < nHeight; nY++) {
					for(int nX = 0; nX < nWidth; nX++) {
						if (m_board.check(nX, nY, piece)) {
							int pos[] = { nX, nY, nAngle };
							piece.m_cPoslist.add(pos);
						}
					}
				}
			}
		}

		for (int nLists = 0; nLists < nListsMax; nLists++) {
			if (isSolve(m_board, m_pieces, m_arrPieceLists[nLists])) {
				System.out.println("YES");
			} else {
				System.out.println("NO");
			}
		}
	}

	public boolean isEnd() {
		boolean	bEnd = false;

		if (m_board == null) {
			bEnd = true;
		} else if (m_board.getHeight() == 0 || m_board.getWidth() == 0) {
			bEnd = true;
		}

		return bEnd;
	}

	public boolean isSolve(Board board, Board pieces[], int arrPieceList[]) {
		boolean	bSolve = false;

		if (board != null && pieces != null && arrPieceList != null) {
			Board   piece      = null;
			int		nListMax   = arrPieceList.length;
			int		nListIndex = 0;
			int		nPosList[] = new int[nListMax];
			int		nPosInfo[] = null;

			while (0 <= nListIndex && nListIndex < nListMax) {
				boolean	bNext = false;

				piece = pieces[arrPieceList[nListIndex] - 1];
				for (;nPosList[nListIndex] < piece.m_cPoslist.size(); nPosList[nListIndex]++) {
					nPosInfo = piece.m_cPoslist.get(nPosList[nListIndex]);
					piece.setAngle(nPosInfo[2]);
					if (board.check(nPosInfo[0], nPosInfo[1], piece)) {
						board.put(nPosInfo[0], nPosInfo[1], piece);
						bNext = true;
						break;
					}
				}

				if (bNext) {
					nListIndex++;
					if (nListIndex < nListMax) {
						nPosList[nListIndex] = 0;
						if (board.isFull()) {
							break;
						}
					}
				} else {
					nListIndex--;
					if (0 <= nListIndex) {
						piece    = pieces[arrPieceList[nListIndex] - 1];
						nPosInfo = piece.m_cPoslist.get(nPosList[nListIndex]);
						piece.setAngle(nPosInfo[2]);
						board.remove(nPosInfo[0], nPosInfo[1], piece);
						nPosList[nListIndex]++;
					}
				}
			}

			if (nListIndex == nListMax && board.isFull()) {
				bSolve = true;
			}

			for(int nRmIndex = 0; nRmIndex < nListIndex; nRmIndex++) {
				piece    = pieces[arrPieceList[nRmIndex] - 1];
				nPosInfo = piece.m_cPoslist.get(nPosList[nRmIndex]);
				piece.setAngle(nPosInfo[2]);
				board.remove(nPosInfo[0], nPosInfo[1], piece);
			}
		}

		return bSolve;
	}

	public class Board {
		// マッチング用の盤面の回転角度
		public	static	final	int					ROTATE_ANGLE_0   = 0;				// 0度
		public	static	final	int					ROTATE_ANGLE_90  = 1;				// 90度
		public	static	final	int					ROTATE_ANGLE_180 = 2;				// 180度
		public	static	final	int					ROTATE_ANGLE_270 = 3;				// 270度

		// 外部からアクセス可能な変数
		public					ArrayList<int[]>	m_cPoslist       = null;			// ボードをセットできる位置

		private	static	final	int					BIT_SIZE         = 32;

		// 内部変数
		private					int[]				m_arrFull        = null;			// 全ビットが埋まっているパターン
		private					int[][]				m_arrBoard       = null;			// オリジナルの盤面
		private					int					m_nHeight        = 0;				// 盤面の幅
		private					int					m_nWidth         = 0;				// 盤面の高さ
		private 				int					m_nAngle         = ROTATE_ANGLE_0;	// 盤面の回転角度

		public void init(String[] arrBoard) {
			if (arrBoard.length > 0) {
				m_nHeight   = arrBoard.length;
				m_nWidth    = arrBoard[0].length();
				m_arrFull   = new int[m_nWidth / BIT_SIZE + 1];
				m_arrBoard  = new int[m_nHeight][m_nWidth / BIT_SIZE + 1];
				m_cPoslist  = new ArrayList<int[]>();

				for(int nY = 0; nY < m_nHeight; nY++) {
					for(int nX = 0; nX < m_nWidth; nX++) {
						switch((int)arrBoard[nY].charAt(nX)) {
						case '#':
							m_arrBoard[nY][nX / BIT_SIZE] |= 1 << (nX % BIT_SIZE);
							break;
						}
					}
				}

				for(int nX = 0; nX < m_nWidth; nX++) {
					m_arrFull[nX / BIT_SIZE] |= 1 << (nX % BIT_SIZE);
				}
			}
		}

		public boolean isFull() {
			boolean	bEnable = true;

			bEnable = true;
			for (int nY = 0; nY < m_nHeight && bEnable; nY++) {
				for (int nX = 0; nX < m_nWidth / BIT_SIZE + 1 && bEnable; nX++) {
					if (m_arrBoard[nY][nX] != m_arrFull[nX]) {
						bEnable = false;
					}
				}
			}

			return bEnable;
		}

		public boolean check(int nCX, int nCY, Board cBoard) {
			boolean	bEnable = false;

			if (cBoard != null) {
				int	nMyHeight = getHeight();
				int	nMyWidth  = getWidth();
	
				if (0 <= nCY && nCY + cBoard.getHeight() <= nMyHeight) {
					if (0 <= nCX && nCX + cBoard.getWidth() <= nMyWidth) {
						int	nBHeight = cBoard.getHeight();
						int	nBWidth  = cBoard.getWidth();
						int	nMPoint  = -1;
						int	nBPoint  = -1;

						bEnable = true;
						for (int nY = 0; nY < nBHeight && bEnable; nY++) {
							for (int nX = 0; nX < nBWidth && bEnable; nX++) {
								nMPoint = getPoint(nCX + nX, nCY + nY);
								nBPoint = cBoard.getPoint(nX, nY);

								if (nMPoint > 0 && nBPoint > 0 || nMPoint == -1 || nBPoint == -1) {
									bEnable = false;
								}
							}
						}
					}
				}
			}

			return bEnable;
		}

		public void put(int nCX, int nCY, Board cBoard) {
			if (cBoard != null) {
				int	nMyHeight = getHeight();
				int	nMyWidth  = getWidth();
	
				if (0 <= nCY && nCY + cBoard.getHeight() <= nMyHeight) {
					if (0 <= nCX && nCX + cBoard.getWidth() <= nMyWidth) {
						int	nBHeight = cBoard.getHeight();
						int	nBWidth  = cBoard.getWidth();
						int	nMPoint  = -1;
						int	nBPoint  = -1;

						for (int nY = 0; nY < nBHeight; nY++) {
							for (int nX = 0; nX < nBWidth; nX++) {
								nMPoint = getPoint(nCX + nX, nCY + nY);
								nBPoint = cBoard.getPoint(nX, nY);
								if (nMPoint == 0 && nBPoint > 0) {
									setPoint(nCX + nX, nCY + nY, nBPoint);
								}
							}
						}
					}
				}
			}
		}

		public void remove(int nCX, int nCY, Board cBoard) {
			if (cBoard != null) {
				int	nMyHeight = getHeight();
				int	nMyWidth  = getWidth();
	
				if (0 <= nCY && nCY + cBoard.getHeight() <= nMyHeight) {
					if (0 <= nCX && nCX + cBoard.getWidth() <= nMyWidth) {
						int	nBHeight = cBoard.getHeight();
						int	nBWidth  = cBoard.getWidth();
						int	nMPoint  = -1;
						int	nBPoint  = -1;

						for (int nY = 0; nY < nBHeight; nY++) {
							for (int nX = 0; nX < nBWidth; nX++) {
								nMPoint = getPoint(nCX + nX, nCY + nY);
								nBPoint = cBoard.getPoint(nX, nY);
								if (nMPoint > 0 && nBPoint > 0) {
									setPoint(nCX + nX, nCY + nY, (byte)0);
								}
							}
						}
					}
				}
			}
		}

		public int getPoint(int nCX, int nCY) {
			int	nPoint  = -1;
			int	nHeight = getHeight();
			int	nWidth  = getWidth();

			if (0 <= nCY && nCY < nHeight) {
				if (0 <= nCX && nCX < nWidth) {
					int nX = nCX;
					int nY = nCY;

					switch(m_nAngle) {
					case ROTATE_ANGLE_0:
						nX = nCX;
						nY = nCY;
						break;
					case ROTATE_ANGLE_90:
						nX = nCY;
						nY = nWidth - nCX - 1;
						break;
					case ROTATE_ANGLE_180:
						nX = nWidth - nCX - 1;
						nY = nHeight - nCY - 1;
						break;
					case ROTATE_ANGLE_270:
						nX = nHeight - nCY- 1;
						nY = nCX;
						break;
					}

					int lBit = (m_arrBoard[nY][nX / BIT_SIZE] >> (nX % BIT_SIZE)) & 1;
					nPoint = (byte)lBit;
				}				
			}

			return nPoint;
		}

		public void setPoint(int nCX, int nCY, int point) {
			int		nHeight = getHeight();
			int		nWidth  = getWidth();

			if (0 <= nCY && nCY < nHeight) {
				if (0 <= nCX && nCX < nWidth) {
					int nX = nCX;
					int nY = nCY;

					switch(m_nAngle) {
					case ROTATE_ANGLE_0:
						nX = nCX;
						nY = nCY;
						break;
					case ROTATE_ANGLE_90:
						nX = nCY;
						nY = nWidth - nCX - 1;
						break;
					case ROTATE_ANGLE_180:
						nX = nWidth - nCX - 1;
						nY = nHeight - nCY - 1;
						break;
					case ROTATE_ANGLE_270:
						nX = nHeight - nCY- 1;
						nY = nCX;
						break;
					}

					int lBit = (point == 0) ? 0xFFFFFFFF ^ (1 << nX % BIT_SIZE) : 1 << nX % BIT_SIZE;
					if (point == 0) {
						m_arrBoard[nY][nX / BIT_SIZE] &= lBit;
					} else {
						m_arrBoard[nY][nX / BIT_SIZE] |= lBit;
					}
				}				
			}
		}

		public int getHeight() {
			int	nHeight = -1;

			switch(m_nAngle) {
			case ROTATE_ANGLE_0:
			case ROTATE_ANGLE_180:
				nHeight = m_nHeight;
				break;
			case ROTATE_ANGLE_90:
			case ROTATE_ANGLE_270:
				nHeight = m_nWidth;
				break;
			}

			return nHeight;
		}

		public int getWidth() {
			int	nWidth = -1;

			switch(m_nAngle) {
			case ROTATE_ANGLE_0:
			case ROTATE_ANGLE_180:
				nWidth = m_nWidth;
				break;
			case ROTATE_ANGLE_90:
			case ROTATE_ANGLE_270:
				nWidth = m_nHeight;
				break;
			}

			return nWidth;
		}

		public int getAngle() {
			return m_nAngle;
		}

		public void setAngle(int nAngle) {
			m_nAngle = nAngle;
		}
	}
}
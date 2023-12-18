import java.util.ArrayList;
import java.util.Scanner;


public class Main {
	private	static	Scanner	m_stdin    = null;
	private			Board	m_board    = null;
	private			Puzzle	m_puzzle[] = null;

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
			main.mainProc();
		}
	}

    public void initBoard() {
    	m_board = createBoard();
	}

    public void initPiece() {
		// ピースの数を取得する
		int		nPieceMax = m_stdin.nextInt();
		Board	cTmpBoard1 = null;
		Board	cTmpBoard2 = null;

		// ピースのデータを取得する
		{
			m_puzzle = new Puzzle[nPieceMax];
			for (int nPiece = 0; nPiece < nPieceMax; nPiece++) {
				m_puzzle[nPiece] = new Puzzle();

				// 回転角度0のピース
				cTmpBoard1 = createBoard();

				// 同じ形のパズルがないか調べる
				for (int nLoop = 0; nLoop < nPiece; nLoop++) {
					cTmpBoard2 = m_puzzle[nLoop].m_cPuzzles[0];
					if (cTmpBoard2 != null) {
						if (cTmpBoard2.isEqual(0, 0, cTmpBoard1)) {
							m_puzzle[nPiece].m_nSameIndex = nLoop;
							break;
						}
					}
				}

				if (m_puzzle[nPiece].m_nSameIndex != -1) {
					continue;
				}

				m_puzzle[nPiece].m_cPuzzles[Puzzle.ROTATE_ANGLE_0] = cTmpBoard1;

				// 回転角度90のピース
				cTmpBoard1 = cTmpBoard1.rot();
				if (m_puzzle[nPiece].m_cPuzzles[Puzzle.ROTATE_ANGLE_0].isEqual(0, 0, cTmpBoard1)) {
					// 回転角度0のピースと同じならこれ以上追加しない
					continue;
				}
				m_puzzle[nPiece].m_cPuzzles[Puzzle.ROTATE_ANGLE_90] = cTmpBoard1;

				// 回転角度180のピース
				cTmpBoard1 = cTmpBoard1.rot();
				if (m_puzzle[nPiece].m_cPuzzles[Puzzle.ROTATE_ANGLE_0].isEqual(0, 0, cTmpBoard1)) {
					// 回転角度0のピースと同じならこれ以上追加しない
					continue;
				}
				m_puzzle[nPiece].m_cPuzzles[Puzzle.ROTATE_ANGLE_180] = cTmpBoard1;

				// 回転角度270のピース
				cTmpBoard1 = cTmpBoard1.rot();
				m_puzzle[nPiece].m_cPuzzles[Puzzle.ROTATE_ANGLE_270] = cTmpBoard1;
			}
		}
	}

    private Board createBoard() {
		int		nHeigth = m_stdin.nextInt();
		int		nWidth  = m_stdin.nextInt();
    	Board	board   = new Board(nHeigth, nWidth);

		// 盤面のデータを取得する
		for (int nLine = 0; nLine < nHeigth; nLine++) {
			board.setLine(nLine, m_stdin.next());
		}

		return board;
    }

	public void mainProc() {
		Puzzle	puzzle      = null;
		Board   piece       = null;
		Board   chkBoard    = new Board(m_board);
		int		nWidth      = m_board.getWidth();
		int		nHeight     = m_board.getWidth();
		boolean	bImpossible = false;


		// 初期状態で各ピースを置けるパターンをチェック
		for(int nIndex = 0; nIndex < m_puzzle.length; nIndex++) {
			for(int nAngle = Puzzle.ROTATE_ANGLE_0; nAngle <= Puzzle.ROTATE_ANGLE_270; nAngle++) {
				puzzle = m_puzzle[nIndex];
				piece  = puzzle.m_cPuzzles[nAngle];

				if (piece != null) {
					for(int nY = 0; nY < nHeight; nY++) {
						for(int nX = 0; nX < nWidth; nX++) {
							if (check(nX, nY, piece)) {
								int pos[] = { nX, nY, nAngle };
								puzzle.m_cPoslist.add(pos);
								chkBoard.put(nX, nY, piece);
							}
						}
					}
				}
			}
		}

		if (!chkBoard.isFull()) {
			bImpossible = true;
		}

		int nPieceListsMax = m_stdin.nextInt();
		for (int nPieceListsIndex = 0; nPieceListsIndex < nPieceListsMax; nPieceListsIndex++) {
			int arrPieceList[] = null;
			int	nPieceNum      = m_stdin.nextInt();

			if (nPieceNum > 0) {
				arrPieceList = new int[nPieceNum];
				for (int nLoop = 0; nLoop < nPieceNum; nLoop++) {
					arrPieceList[nLoop] = m_stdin.nextInt() - 1;
				}

				if (!bImpossible) {
					if (isSolve(arrPieceList) == 0) {
						System.out.println("YES");
					} else {
						System.out.println("NO");
					}
				} else {
					System.out.println("NO");
				}
			}
		}
	}

	public int isSolve(int arrPieceList[]) {
		int	nSolve = -1;

		if (m_board != null && m_puzzle != null && arrPieceList != null) {
			Puzzle	puzzle      = null;
			Board   piece       = null;
			int		nListMax    = arrPieceList.length;
			int		nListIndex  = 0;
			int		nPosList[]  = new int[nListMax];
			int		nPosInfo[]  = null;
			
			while (0 <= nListIndex && nListIndex < nListMax) {
				boolean	bNext = false;

				{
					int nTmp = getTrueIndex(arrPieceList, nListIndex);
					puzzle   = m_puzzle[nTmp];
	
					for (;nPosList[nListIndex] < puzzle.m_cPoslist.size(); nPosList[nListIndex]++) {
						nPosInfo = puzzle.m_cPoslist.get(nPosList[nListIndex]);
						piece    = puzzle.m_cPuzzles[nPosInfo[2]];
	
						if (check(nPosInfo[0], nPosInfo[1], piece)) {
							m_board.put(nPosInfo[0], nPosInfo[1], piece);
							bNext = true;
							break;
						}
					}
				}

				if (bNext) {
//					dump();
					nListIndex++;
					if (nListIndex < nListMax) {
						int nTmp = getPreIndex(arrPieceList, nListIndex);
						if (nListIndex != nTmp) {
							nPosList[nListIndex] = nPosList[nTmp] + 1;
						} else {
							nPosList[nListIndex] = 0;
						}

						if (m_board.isFull()) {
							break;
						}
					}
				} else {
//					dump();
					nListIndex--;
					if (0 <= nListIndex) {
						int nTmp = getTrueIndex(arrPieceList, nListIndex);
						puzzle   = m_puzzle[nTmp];
						nPosInfo = puzzle.m_cPoslist.get(nPosList[nListIndex]);
						piece    = puzzle.m_cPuzzles[nPosInfo[2]];
						m_board.remove(nPosInfo[0], nPosInfo[1], piece);
						nPosList[nListIndex]++;
					}
				}
			}

			if (nListIndex == nListMax && m_board.isFull()) {
				nSolve = 0;
			}

			for(int nRmIndex = 0; nRmIndex < nListIndex; nRmIndex++) {
				int nTmp = getTrueIndex(arrPieceList, nRmIndex);
				puzzle   = m_puzzle[nTmp];
				nPosInfo = puzzle.m_cPoslist.get(nPosList[nRmIndex]);
				piece    = puzzle.m_cPuzzles[nPosInfo[2]];
				m_board.remove(nPosInfo[0], nPosInfo[1], piece);
			}
		}

		return nSolve;
	}

	public int getTrueIndex(int arrPieceList[], int nCurIndex) {
		int		nIndex = arrPieceList[nCurIndex];
		Puzzle	puzzle = m_puzzle[nIndex];

		return (puzzle.m_nSameIndex != -1) ? puzzle.m_nSameIndex : nIndex;
	}

	public int getPreIndex(int arrPieceList[], int nCurIndex) {
		int		nIndex    = arrPieceList[nCurIndex];
		Puzzle	puzzle    = m_puzzle[nIndex];
		int		nPreIndex = nCurIndex;

		if (nCurIndex > 0) {
			for (int nLoop = nCurIndex - 1; nLoop >= 0; nLoop--) {
				int		nTmpIndex = arrPieceList[nLoop];
				Puzzle	tmpPuzzle = m_puzzle[nTmpIndex];
				if (puzzle.m_nSameIndex == tmpPuzzle.m_nSameIndex ||
				    puzzle.m_nSameIndex == nTmpIndex ||
				    nIndex == tmpPuzzle.m_nSameIndex ||
				    nIndex == nTmpIndex) {
					nPreIndex = nLoop;
					break;
				}
			}
		}

		return nPreIndex;
	}

	public void dump() {
		int nW = m_board.getWidth();
		int nH = m_board.getHeight();

		System.out.println("");
		for (int nLoop1 = 0; nLoop1 < nH; nLoop1++) {
			int nBit = m_board.getLine(nLoop1);
			for (int nLoop2 = nW - 1; nLoop2 >= 0; nLoop2--) {
				if((nBit & 1 << nLoop2) == 0) {
					System.out.print(".");
				} else {
					System.out.print("#");
				}
			}
			System.out.println("");
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

	public boolean check(int nCX, int nCY, Board cBoard) {
		boolean	bEnable = false;
	
		if (cBoard != null) {
			if (0 <= nCY && nCY + cBoard.getHeight() <= m_board.m_nHeight) {
				if (0 <= nCX && nCX + cBoard.getWidth() <= m_board.m_nWidth) {
					int	nHeight = cBoard.getHeight();
	
					bEnable = true;
					for (int nY = 0; nY < nHeight && bEnable; nY++) {
						int	nPBit = cBoard.getLine(nY) << nCX;
						int	nBBit = m_board.getLine(nCY + nY) & m_board.m_nFullBit;

						if ((~nBBit & nPBit) != nPBit) {
							bEnable = false;
						}
					}
				}
			}
		}
	
		return bEnable;
	}

	public class Puzzle {
		// マッチング用の盤面の回転角度
		public	static	final	int					ROTATE_ANGLE_0   = 0;		// 0度
		public	static	final	int					ROTATE_ANGLE_90  = 1;		// 90度
		public	static	final	int					ROTATE_ANGLE_180 = 2;		// 180度
		public	static	final	int					ROTATE_ANGLE_270 = 3;		// 270度

		// 外部からアクセス可能な変数
		public					Board				m_cPuzzles[]     = null;	// 角度別のパズル
		public					ArrayList<int[]>	m_cPoslist       = null;	// ピースのおける位置
		public					int					m_nSameIndex     = -1;		// 同じ形のパズルの番号

		public Puzzle() {
			m_cPuzzles = new Board[4];
			m_cPoslist = new ArrayList<int[]>();
		}
	}

	public class Board {
		// 内部変数
		private	int[]				m_arrBoard = null;	// 盤面
		private int					m_nFullBit = 0;		// 埋まった盤面
		private	int					m_nHeight  = 0;		// 盤面の幅
		private	int					m_nWidth   = 0;		// 盤面の高さ

		public Board(int nHeight, int nWidth) {
			setHeight(nHeight);
			setWidth(nWidth);
		}

		public Board(Board cBoard) {
			setHeight(cBoard.getHeight());
			setWidth(cBoard.getWidth());

			for (int nH = 0; nH < this.m_nHeight; nH++) {
				setLine(nH, cBoard.getLine(nH));
			}
		}

		public void setHeight(int nHeight) {
			this.m_nHeight  = nHeight;
			this.m_arrBoard = new int[this.m_nHeight];
		}

		public int getHeight() {
			return this.m_nHeight;
		}

		public void setWidth(int Width) {
			this.m_nWidth   = Width;
			this.m_nFullBit = (int)(Math.pow(2.0, (double)Width) - 1.0);
		}

		public int getWidth() {
			return this.m_nWidth;
		}

		public void setLine(int nLine, String szLine) {
			if (0 <= nLine && nLine < this.m_nHeight) {
				int nBit = 0;

				for (char c : szLine.toCharArray()) {
					nBit <<= 1;
					nBit |= (c == '#') ? 1 : 0;
				}

				this.m_arrBoard[nLine] = nBit;
			}
		}

		public void setLine(int nLine, int nBit) {
			if (0 <= nLine && nLine < this.m_nHeight) {
				this.m_arrBoard[nLine] = nBit;
			}
		}

		public int getLine(int nLine) {
			int nBit = 0;

			if (0 <= nLine && nLine < this.m_nHeight) {
				nBit = this.m_arrBoard[nLine];
			}

			return nBit;
		}

		public boolean isFull() {
			boolean	bEnable = true;

			for (int nH = 0; nH < this.m_nHeight; nH++) {
				if (this.m_arrBoard[nH] != this.m_nFullBit) {
					bEnable = false;
					break;
				}
			}

			return bEnable;
		}

		public boolean isEqual(int nCX, int nCY, Board cBoard) {
			boolean	bEnable = false;
		
			if (cBoard != null) {
				if (0 <= nCY && nCY + cBoard.getHeight() <= this.m_nHeight) {
					if (0 <= nCX && nCX + cBoard.getWidth() <= this.m_nWidth) {
						int	nHeight = cBoard.getHeight();
		
						bEnable = true;
						for (int nY = 0; nY < nHeight && bEnable; nY++) {
							int	nPBit = cBoard.getLine(nY) << nCX;
							int	nBBit = getLine(nCY + nY) & this.m_nFullBit;

							if (nBBit != nPBit) {
								bEnable = false;
							}
						}
					}
				}
			}
		
			return bEnable;
		}

		public void put(int nCX, int nCY, Board cBoard) {
			if (cBoard != null) {
				int	nBHeight = cBoard.getHeight();
				
				for (int nY = 0; nY < nBHeight; nY++) {
					int	nBBit = cBoard.getLine(nY) << nCX;
					int	nMBit = getLine(nCY + nY);

					setLine(nCY + nY, nMBit | nBBit);
				}
			}
		}

		public void remove(int nCX, int nCY, Board cBoard) {
			if (cBoard != null) {
				int	nBHeight = cBoard.getHeight();
				
				for (int nY = 0; nY < nBHeight; nY++) {
					int	nBBit = cBoard.getLine(nY) << nCX;
					int	nMBit = getLine(nCY + nY);

					setLine(nCY + nY, nMBit & ~nBBit);
				}
			}
		}

		public Board rot() {
			Board	board = new Board(this.m_nWidth, this.m_nHeight);

			for (int nX = 0; nX < this.m_nWidth; nX++) {
				int	nBit  = 0;

				for (int nY = 0; nY < this.m_nHeight; nY++) {
					int nMask = (int)Math.pow(2.0, (int)nX);
					nBit <<= 1;
					if ((getLine(nY) & nMask) == nMask) {
						nBit |= 1;
					}
				}

				board.setLine(nX, nBit);
			}

			return board;
		}
	}
}
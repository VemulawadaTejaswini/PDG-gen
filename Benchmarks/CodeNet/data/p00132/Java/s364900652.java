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
//			main.initPieceLists();
			main.mainProc();
		}
	}

    public void initBoard() {
    	m_board = createBoard();
	}

    public void initPiece() {
		// ピースの数を取得する
		int		nPieceMax = m_stdin.nextInt();
		Board	cTmpBoard = null;

		// ピースのデータを取得する
		{
			m_puzzle = new Puzzle[nPieceMax];
			for (int nPiece = 0; nPiece < nPieceMax; nPiece++) {
				m_puzzle[nPiece] = new Puzzle();

				// 回転角度0のピース
				cTmpBoard = createBoard();
				m_puzzle[nPiece].m_cPuzzles[Puzzle.ROTATE_ANGLE_0] = cTmpBoard;

				// 回転角度90のピース
				cTmpBoard = cTmpBoard.rot();
				if (m_puzzle[nPiece].m_cPuzzles[Puzzle.ROTATE_ANGLE_0].isEqual(0, 0, cTmpBoard)) {
					// 回転角度0のピースと同じならこれ以上追加しない
					continue;
				}
				m_puzzle[nPiece].m_cPuzzles[Puzzle.ROTATE_ANGLE_90] = cTmpBoard;

				// 回転角度180のピース
				cTmpBoard = cTmpBoard.rot();
				if (m_puzzle[nPiece].m_cPuzzles[Puzzle.ROTATE_ANGLE_0].isEqual(0, 0, cTmpBoard)) {
					// 回転角度0のピースと同じならこれ以上追加しない
					continue;
				}
				m_puzzle[nPiece].m_cPuzzles[Puzzle.ROTATE_ANGLE_180] = cTmpBoard;

				// 回転角度270のピース
				cTmpBoard = cTmpBoard.rot();
				m_puzzle[nPiece].m_cPuzzles[Puzzle.ROTATE_ANGLE_270] = cTmpBoard;
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

/*    public void initPieceLists() {
		// ピースリストの数を取得する
		int nPieceListsMax = m_stdin.nextInt();

		// ピースのデータを取得する
		{
			m_arrPieceLists = new int[nPieceListsMax][];
			for (int nPieceListsIndex = 0; nPieceListsIndex < nPieceListsMax; nPieceListsIndex++) {
				m_arrPieceLists[nPieceListsIndex] = createPieceList();
			}
		}
    }*/

/*    private int[] createPieceList() {
    	int		arrPieceList[] = null;

		// 盤面のリストの要素数を取得する
		{
			int	nPieceNum = m_stdin.nextInt();

			if (nPieceNum > 0) {
				arrPieceList = new int[nPieceNum];
				for (int nLoop = 0; nLoop < nPieceNum; nLoop++) {
					arrPieceList[nLoop] = m_stdin.nextInt() - 1;
				}
			}
		}

		return arrPieceList;
    }*/

	public void mainProc() {
//		Puzzle	puzzle    = null;
//		Board   piece     = null;
//		int		nIndexMax = m_puzzle.length;
//		int		nWidth    = m_board.getWidth();
//		int		nHeight   = m_board.getWidth();
//		int		nListsMax = m_arrPieceLists.length;

		// 初期状態で各ピースを置けるパターンをチェック
/*		for(int nIndex = 0; nIndex < nIndexMax; nIndex++) {
			for(int nAngle = Puzzle.ROTATE_ANGLE_0; nAngle <= Puzzle.ROTATE_ANGLE_270; nAngle++) {
				puzzle = m_puzzle[nIndex];
				piece  = puzzle.m_cPuzzles[nAngle];

				if (piece != null) {
					for(int nY = 0; nY < nHeight; nY++) {
						for(int nX = 0; nX < nWidth; nX++) {
							if (check(nX, nY, piece)) {
								int pos[] = { nX, nY, nAngle };
								puzzle.m_cPoslist.add(pos);
							}
						}
					}
				}
			}
		}*/

		int nPieceListsMax = m_stdin.nextInt();
		for (int nPieceListsIndex = 0; nPieceListsIndex < nPieceListsMax; nPieceListsIndex++) {
			int arrPieceList[] = null;
			int	nPieceNum      = m_stdin.nextInt();

			if (nPieceNum > 0) {
				arrPieceList = new int[nPieceNum];
				for (int nLoop = 0; nLoop < nPieceNum; nLoop++) {
					arrPieceList[nLoop] = m_stdin.nextInt() - 1;
				}
			}

			if (isSolve(arrPieceList, 0, 0, 0, 0, (int)Math.pow(2.0, (double)nPieceNum) - 1) == 0) {
				System.out.println("YES");
			} else {
				System.out.println("NO");
			}			
		}

/*		int	nListsMax      = m_arrPieceLists.length;

		for (int nListsIndex = 0; nListsIndex < nListsMax; nListsIndex++) {
			if (isSolve(m_arrPieceLists[nListsIndex], 0, 0, 0) == 0) {
				System.out.println("YES");
			} else {
				System.out.println("NO");
			}
		}*/
	}

	public int isSolve(int arrPieceList[], int nIndex, int nX, int nY, int nCurState, int nFullState) {
		int	nSolve = -1;

		if (m_board != null && m_puzzle != null && arrPieceList != null) {
			{
				boolean bUserAll = (nCurState == nFullState);	// 全てのピースを使ったか
				boolean bFull    = (m_board.isFull());			// 盤面が埋まったか
	
				if (bFull) {
					if (bUserAll) {
						// 盤面が埋まったかつ全てのピースを使った場合は成功で探索終了
						return 0;
					} else {
						// 盤面が埋まったかつ全てのピースを使わなかった場合は失敗で探索終了
						return -2;
					}
				} else {
					if (bUserAll) {
						// 盤面が埋まらなかったかつ全てのピースを使った場合は失敗で探索終了
						return -2;
					}
				}
			}

/*			{
				int	nPuzzleIndex = arrPieceList[nIndex];
				if (nPuzzleIndex < m_puzzle.length) {
					Puzzle	puzzle = m_puzzle[nPuzzleIndex];

					if (puzzle != null) {
						for (int nLoop = 0;nLoop < puzzle.m_cPoslist.size(); nLoop++) {
							int	nPosInfo[] = puzzle.m_cPoslist.get(nLoop);

							if (nPosInfo != null) {
								Board	piece = puzzle.m_cPuzzles[nPosInfo[2]];

								if (check(nPosInfo[0], nPosInfo[1], piece)) {
									m_board.put(nPosInfo[0], nPosInfo[1], piece);
			
									nSolve = isSolve(arrPieceList, nIndex + 1, nPosInfo[0], nPosInfo[1]);
			
									m_board.remove(nPosInfo[0], nPosInfo[1], piece);
			
									// 探索が終了したらおしまい
									if (nSolve == 0 || nSolve == -2) {
										break;
									}
								}
							}
						}
					}
				}
			}*/

			if (nX == m_board.getWidth()) {
				// 右端まで見終わったら次の行を探索
				return isSolve(arrPieceList, nIndex, 0, nY + 1, nCurState, nFullState);
			}

			if (nY == m_board.getHeight()) {
				// 最下層まで見終わったら次の行を探索
				return -1;
			}

			{
				boolean bSearch = true;
				for (int nLoop1 = nIndex; nLoop1 < arrPieceList.length && bSearch; nLoop1++) {
					if ((nCurState & 1 << nLoop1) == 1 << nLoop1) {
						// 既にピースが置かれていたらスキップする
						continue;
					}

					Puzzle	puzzle = m_puzzle[arrPieceList[nLoop1]];

					for (int nLoop2 = 0; nLoop2 < puzzle.m_cPuzzles.length && bSearch; nLoop2++) {
						Board	piece = puzzle.m_cPuzzles[nLoop2];

						if (check(nX, nY, piece)) {
							m_board.put(nX, nY, piece);
							nCurState += 1 << nLoop1;
							nSolve = isSolve(arrPieceList, nLoop1 + 1, nX, nY, nCurState, nFullState);
							m_board.remove(nX, nY, piece);
							nCurState -= 1 << nLoop1;

							// 探索が終了したらおしまい
							if (nSolve == 0 || nSolve == -2) {
								bSearch = false;
							}
						}
					}
				}

				if (nSolve == -1) {
					nSolve = isSolve(arrPieceList, 0, nX + 1, nY, nCurState, nFullState);
				}
			}
		}

		return nSolve;
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
		public	static	final	int		ROTATE_ANGLE_0   = 0;		// 0度
		public	static	final	int		ROTATE_ANGLE_90  = 1;		// 90度
		public	static	final	int		ROTATE_ANGLE_180 = 2;		// 180度
		public	static	final	int		ROTATE_ANGLE_270 = 3;		// 270度

		// 外部からアクセス可能な変数
		public					Board	m_cPuzzles[]     = null;	// 角度別のパズル

		public Puzzle() {
			m_cPuzzles = new Board[4];
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
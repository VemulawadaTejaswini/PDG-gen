import java.util.Scanner;

public class Main {

	static class Tank {
		// 戦車の行座標
		private int tankRow;

		// 戦車の列座標
		private int tankColumn;

		// 戦車の向き
		private String tankDilection;

		// フィールド情報
		String[][] inputFirld;

		// 戦車の行座標のゲッター・セッター
		int getTankRow() {
			return tankRow;
		}

		void setTankRow(int row) {
			tankRow = row;
		}

		// 戦車の列座標のゲッター・セッター
		int getTankColumn() {
			return tankColumn;
		}

		void setTankColumn(int column) {
			tankColumn = column;
		}

		// 戦車の向きのゲッター・セッター
		String getTankDilection() {
			return tankDilection;
		}

		void setTankDilection(String dilection) {
			tankDilection = dilection;
		}

		// フィールド情報
		String[][] getInputFirld() {
			return inputFirld;
		}

		void setInputFirld(String[][] map) {
			inputFirld = map;
		}

		// 戦車のコンストラクタ
		Tank(int row, int column, String[][] map) {

			// フィールドの情報を取得
			setInputFirld(map);

			// 戦車の位置を検索
			 for (int rowi = 0; rowi < row; rowi++) {
				for (int columni = 0; columni < column; columni++) {

					// 戦車上向き
					if (map[rowi][columni].equals("^")) {
						// 戦車の行座標
						setTankRow(rowi);
						// 戦車の列座標
						setTankColumn(columni);
						// 戦車の向き
						setTankDilection("^");
						break ;

						// 戦車下向き
					} else if (map[rowi][columni].equals("v")) {
						// 戦車の行座標
						setTankRow(rowi);
						// 戦車の列座標
						setTankColumn(columni);
						// 戦車の向き
						setTankDilection("v");
						break ;

						// 戦車左向き
					} else if (map[rowi][columni].equals("<")) {
						// 戦車の行座標
						setTankRow(rowi);
						// 戦車の列座標
						setTankColumn(columni);
						// 戦車の向き
						setTankDilection("<");
						break ;

						// 戦車右向き
					} else if (map[rowi][columni].equals(">")) {
						// 戦車の行座標
						setTankRow(rowi);
						// 戦車の列座標
						setTankColumn(columni);
						// 戦車の向き
						setTankDilection(">");
						break ;
					}

				}

			}
		}

		// 戦車の向き変更,進行または発射
		public String[][] actionTank(String dilection) {

			// 上入力
			if (dilection.equals("U")) {
				setTankDilection("^");
				inputFirld[getTankRow()][getTankColumn()] = getTankDilection();

				// 移動先が範囲内になるとき
				if (getTankRow() - 1 >= 0) {
					// 上のマスが平地ならに上に進む
					if (inputFirld[getTankRow() - 1][getTankColumn()].equals(".")) {

						// 戦車のいたマスが平地になり,平地に戦車が進む
						inputFirld[getTankRow()][getTankColumn()] = ".";
						inputFirld[getTankRow() - 1][getTankColumn()] = getTankDilection();
						setTankRow(getTankRow() - 1);

					}
				}

				// 右入力
			} else if (dilection.equals("R")) {
				setTankDilection(">");
				inputFirld[getTankRow()][getTankColumn()] = getTankDilection();

				if (getTankColumn() + 1 < inputFirld[1].length) {
					// 右のマスが平地ならに右に進む
					if (inputFirld[getTankRow()][getTankColumn() + 1].equals(".")) {

						// 戦車のいたマスが平地になり平地に戦車が進む
						inputFirld[getTankRow()][getTankColumn()] = ".";
						inputFirld[getTankRow()][getTankColumn() + 1] = getTankDilection();
						setTankColumn(getTankColumn() + 1);

					}
				}

				// 下入力
			} else if (dilection.equals("D")) {
				setTankDilection("v");
				inputFirld[getTankRow()][getTankColumn()] = getTankDilection();

				if (getTankRow() + 1 < inputFirld.length) {
					// 下のマスが平地ならに下に進む
					if (inputFirld[getTankRow() + 1][getTankColumn()].equals(".")) {

						// 戦車のいたマスが平地になり平地に戦車が進む
						inputFirld[getTankRow()][getTankColumn()] = ".";
						inputFirld[getTankRow() + 1][getTankColumn()] = getTankDilection();
						setTankRow(getTankRow() + 1);

					}
				}

				// 左入力
			} else if (dilection.equals("L")) {
				setTankDilection("<");
				inputFirld[getTankRow()][getTankColumn()] = getTankDilection();

				if (getTankColumn() - 1 >= 0) {
					// 左のマスが平地ならに左に進む
					if (inputFirld[getTankRow()][getTankColumn() - 1].equals(".")) {

						// 戦車のいたマスが平地になり平地に戦車が進む
						inputFirld[getTankRow()][getTankColumn()] = ".";
						inputFirld[getTankRow()][getTankColumn() - 1] = getTankDilection();
						setTankColumn(getTankColumn() - 1);

					}
				}

			} else if (dilection.equals("S")) {
				shotShell(getInputFirld());

			}

			return inputFirld;
		}

		void shotShell(String[][] inputFirld) {
			// 戦車が上方向を向いているとき
			if (getTankDilection().equals("^")) {
				// 条件式 砲弾の飛ぶ距離
				for (int lengthShell = 1; lengthShell < getTankRow() + 1; lengthShell++) {

					// 砲弾の進行方向にレンガの壁があったとき
					if (inputFirld[getTankRow() - lengthShell][getTankColumn()].equals("*")) {
						inputFirld[getTankRow() - lengthShell][getTankColumn()] = ".";
						break;

						// 進行方向に鉄の壁があったとき
					} else if (inputFirld[getTankRow() - lengthShell][getTankColumn()].equals("#")) {
						break;
					}
				}

				// 戦車が右を向いているとき
			} else if (getTankDilection().equals(">")) {
				// 条件式 砲弾の飛ぶ距離
				for (int lengthShell = 1; lengthShell < inputFirld[0].length - getTankColumn(); lengthShell++) {

					// 進行方向にレンガの壁があったとき
					if (inputFirld[getTankRow()][getTankColumn() + lengthShell].equals("*")) {
						inputFirld[getTankRow()][getTankColumn() + lengthShell] = ".";
						break;

						// 進行方向に鉄の壁があったとき
					} else if (inputFirld[getTankRow()][getTankColumn() + lengthShell].equals("#")) {
						break;
					}
				}

				// 戦車が下を向いているとき
			} else if (getTankDilection().equals("v")) {
				// 条件式 砲弾の飛ぶ距離
				for (int lengthShell = 1; lengthShell < inputFirld.length - getTankRow(); lengthShell++) {

					// 進行方向にレンガの壁があったとき
					if (inputFirld[getTankRow() + lengthShell][getTankColumn()].equals("*")) {
						inputFirld[getTankRow() + lengthShell][getTankColumn()] = ".";
						break;

						// 進行方向に鉄の壁があったとき
					} else if (inputFirld[getTankRow() + lengthShell][getTankColumn()].equals("#")) {
						break;
					}
				}

				// 戦車が左を向いているとき
			} else if (getTankDilection().equals("<")) {
				// 条件式 砲弾の飛ぶ距離
				for (int lengthShell = 1; lengthShell < getTankColumn() + 1; lengthShell++) {

					// 進行方向にレンガの壁があったとき
					if (inputFirld[getTankRow()][getTankColumn() - lengthShell].equals("*")) {
						inputFirld[getTankRow()][getTankColumn() - lengthShell] = ".";
						break;

						// 進行方向に鉄の壁があったとき
					} else if (inputFirld[getTankRow()][getTankColumn() - lengthShell].equals("#")) {
						break;
					}
				}
			}

		}
	}

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);

		// 入力回数
		int inputNum = scan.nextInt();

		// 入力回数分ループ
		for (int playNum = 0; playNum < inputNum; playNum++) {

			// 行数を入力
			int row = scan.nextInt();

			// 列数を入力
			int column = scan.nextInt();

			scan.nextLine();

			// マップ(二次元配列)の入力
			String[][] map = new String[row][column];

			for (int rowi = 0; rowi < row; rowi++) {

				String strLine = scan.nextLine();

				for (int columni = 0; columni < column; columni++) {
					map[rowi][columni] = String.valueOf(strLine.charAt(columni));
				}
			}

			// 戦車を作成
			Tank tank = new Tank(row, column, map);

			// 戦車行動回数
			int commandNum = scan.nextInt();

			// 行の空読み
			scan.nextLine();

			// 入力コマンド
			String commandTank = scan.nextLine();

			for (int commandTanki = 0; commandTanki < commandNum; commandTanki++) {
				// コマンドの入力
				map = tank.actionTank(String.valueOf(commandTank.charAt(commandTanki)));
			}

			// 戦車行動後のマップを出力
			for (int rowi = 0; rowi < row; rowi++) {
				for (int columni = 0; columni < column; columni++) {
					System.out.print(map[rowi][columni]);
				}
				System.out.println("");
			}
			if (playNum < inputNum - 1) {
				System.out.println("");
			}
		}
		scan.close();
	}
}


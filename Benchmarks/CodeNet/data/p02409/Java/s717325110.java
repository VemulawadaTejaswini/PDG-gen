import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

	static private enum House {
		Building(4),
		Floor(3),
		Room(10);

		private int number;
		public int getnumber() {
			return this.number;
		}

		private House(int number) {
			this.number = number;
		}
	}
	public static void main(String[] args) throws NumberFormatException, IOException {
		// TODO 自動生成されたメソッド・スタブ
		BufferedReader input = new BufferedReader(new InputStreamReader(System.in));
		int lists = Integer.parseInt(input.readLine());
		String[] inputListStr = null;
		int[][][] listData = new int[House.Building.getnumber()][House.Floor.getnumber()][House.Room.getnumber()];

		for (int i = 0; i < lists; i++) {
			inputListStr = (input.readLine()).split("\\s");
			int b = Integer.parseInt(inputListStr[0]);
			int f = Integer.parseInt(inputListStr[1]);
			int r = Integer.parseInt(inputListStr[2]);
			int v = Integer.parseInt(inputListStr[3]);

			listData[b -1][f -1][r -1] += v;
		}

		for (int i = 0; i < House.Building.getnumber(); i++) {
			for (int j = 0; j < House.Floor.getnumber(); j++) {
				for (int k = 0; k < House.Room.getnumber(); k++) {
					System.out.print(" " + listData[i][j][k]);
				}
				System.out.println();
			}
			if (i != 3) {
				System.out.println("####################");
			}
		}

	}

}


import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		int[][] ty = new int[10000][2];
		int t = 1;
		int y = 1;

		int count = 0;

		for (int i = 0; t != 0 || y != 0; i++) {

			String line = sc.nextLine();
			String[] HW = line.split(" ");
			t = Integer.parseInt(HW[0]);
			y = Integer.parseInt(HW[1]);
			ty[i][0] = t;
			ty[i][1] = y;

			count++;

		}

		for (int i = 0; i < count-1; i++) {



			//ここを分岐させる
			StringBuilder x = new StringBuilder();
			for (int j = 0; j < ty[i][1]; j++) {

				x.append("#");


			}

			String z = x.toString();


			StringBuilder a = new StringBuilder();

			for (int j = 0; j < ty[i][1]; j++) {
				if (j == 0 || j== ty[i][1]-1) {
					a.append("#");
				}else{
					a.append(".");
				}

			}


			String b = a.toString();



			for (int j = 0; j < ty[i][0]; j++) {
				if (j == 0 || j== ty[i][0]-1) {
					System.out.println(z);
				} else {
					System.out.println(b);
				}

			}
			System.out.println("");


		}

	}

}


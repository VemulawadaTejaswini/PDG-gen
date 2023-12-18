import java.util.Scanner;
public class Main {

	public static void main(String[] args) {

		Scanner stdin = new Scanner(System.in);

		String[] a = new String[2];
		String[][] b = new String[2][6];




		for(int i = 0; i < 2; i++) {

			a[i] = stdin.nextLine();
			b[i] = a[i].split(" ");

		}

		for(int i = 0; i < 6; i++) {

			System.out.println(b[0][i]);

		}

		double[] x = new double[2];
		double[] y = new double[2];

		for(int i = 0; i < 2; i ++) {

			for(int j = 0; j < 6; j++) {

				x[i] = (Integer.parseInt(b[i][4]) * Integer.parseInt(b[i][2])
						- Integer.parseInt(b[i][1]) * Integer.parseInt(b[i][5]))
						/ (Integer.parseInt(b[i][0]) * Integer.parseInt(b[i][4])
								- Integer.parseInt(b[i][1]) * Integer.parseInt(b[i][3]));

				y[i] = (Integer.parseInt(b[i][3]) * Integer.parseInt(b[i][2])
						- Integer.parseInt(b[i][0]) * Integer.parseInt(b[i][5]))
						/(Integer.parseInt(b[i][1]) * Integer.parseInt(b[i][3])
								- Integer.parseInt(b[i][0]) * Integer.parseInt(b[i][4]));
			}
		}

		for(int i = 0; i < 2; i++) {

			System.out.println(x[i] + ", " + y[i]);
		}


	}
}
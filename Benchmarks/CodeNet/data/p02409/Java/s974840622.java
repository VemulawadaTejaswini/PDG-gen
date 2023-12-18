import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		int[][][] array = new int[4][3][10];
		Scanner scanner = new Scanner(System.in);
		int n = scanner.nextInt();
		for (int i=0; i < n; i++) {
			int b = Integer.parseInt(scanner.next());
			int f = Integer.parseInt(scanner.next());
			int r = Integer.parseInt(scanner.next());
			int v = Integer.parseInt(scanner.next());
			array[b-1][f-1][r-1] = array[b-1][f-1][r-1] + v;
		}
		scanner.close();
		for (int i=0; i < 4; i++) {
			for (int j=0; j < 3; j++) {
				for (int k=0; k < 10; k++) {
					System.out.print(k == 9 ?   " "  + array[i][j][k] + "\n" :  " " + array[i][j][k]);
				}
			}
			if (i != 3 ) System.out.println("####################");
		}
	}
}
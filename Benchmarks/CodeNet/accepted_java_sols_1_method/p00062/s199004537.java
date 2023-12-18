import java.util.Scanner;

public class Main {
	static Scanner sc = new java.util.Scanner(System.in);

	public static void main(String[] args) {
		// String[] stringline = new String[10];
		int[][] intline = new int[10][10];

		/*
		 * for(int i=0;i<10;i++){ stringline[i]=""; } for(int i=0;i<10;i++){
		 * for(int j=0;j<10;j++){ intline[i][j]=0; } }
		 */

		while (sc.hasNext()) {
			String str = "";
			str = sc.nextLine();
			String[] stringline = str.split("");

			for (int j = 0; j < 10; j++) {
				intline[0][j] = Integer.parseInt(stringline[j]);
			}
			for (int i = 1; i < 10; i++) {
				for (int j = 0; j < 9; j++) {
					intline[i][j] = (intline[i - 1][j] + intline[i - 1][j + 1]) % 10;
				}
			}
			System.out.println(intline[9][0]);
		}

		
	}

}
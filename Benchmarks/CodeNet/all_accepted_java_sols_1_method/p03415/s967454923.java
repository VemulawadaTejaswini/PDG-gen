import java.util.Scanner;

public class Main {
	/**
	 * Main method.
	 */
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		
		String[][] field = new String[3][3];
		for (int i = 0; i < 3; i++) {
			String line = s.next();
			for (int j = 0; j < 3; j++) {
				field[i][j] = line.substring(j, j+1);
			}
		}
		
		System.out.println(field[0][0] + field[1][1] + field[2][2]);
		
	}
}
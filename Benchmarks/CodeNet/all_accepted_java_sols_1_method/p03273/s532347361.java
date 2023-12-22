
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		
		
		Scanner scan = new Scanner(System.in);
		int x = scan.nextInt();
		int y = scan.nextInt();
		String[] square = new String[x];
		
		for (int i = 0; i < square.length; i++) {
			square[i] = scan.next();
		}
		
		boolean[] col = new boolean[y];
		boolean[] row = new boolean[x];

		for (int i = 0; i < square.length; i++) {
			for (int j = 0; j < col.length; j++) {
				if (square[i].charAt(j) == '#') {
					row[i] = true;
					col[j] = true;
				}
			}
		}
		
		for (int i = 0; i < row.length; i++) {
			if (row[i]) {
				for (int j = 0; j < col.length; j++) {
					if (col[j]) {
						System.out.print(square[i].charAt(j));
					}
				}
			}
			System.out.println();
		}
		
		System.out.println();
	}
}
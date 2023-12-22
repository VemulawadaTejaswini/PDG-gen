import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int h = sc.nextInt();
		int w = sc.nextInt();
		sc.nextLine();
		char[][] array = new char[h][];
		boolean[] uncompressRows = new boolean[h];
		boolean[] uncompressColumns = new boolean[w];

		for (int i = 0; i < h; i++) {
			array[i]  = sc.nextLine().toCharArray();
			for (int j = 0; j < w; j++) {
				if (array[i][j] == '#') {
					uncompressRows[i] = true;
					uncompressColumns[j] = true;
				}
			}
		}
		StringBuilder sb = new StringBuilder();
		for (int i = 0; i < h; i++) {
			if (!uncompressRows[i]) {
				continue;
			}
			for (int j = 0; j < w; j++) {
				if (uncompressColumns[j]) {
					sb.append(array[i][j]);
				}
			}
			sb.append('\n');
		} 
		System.out.println(sb.toString());      
	}
}
import java.util.*;

public class Main {

	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		int b = sc.nextInt();
		int w = 100;
		int h = 42;
		int countA = 1;
		int countB = 1;
		char[][] blacks = new char[21][100];
		char[][] whites = new char[21][100];
		for (int i = 0; i < 21; i++){
			Arrays.fill(blacks[i], '#');
			Arrays.fill(whites[i], '.');
		}
		for (int i = 0; i < 21; i += 2) {
			for (int j = 0; j < 100; j += 2) {
				if (countA < a) {
					blacks[i][j] = '.';
					countA++;
				}
				if (countB < b) {
					whites[i + 1][j] = '#';
					countB++;
				}
			}
		}
		StringBuilder sbA = new StringBuilder();
		StringBuilder sbB = new StringBuilder();
		for (int i = 0; i < 21; i++) {
			sbA.append(blacks[i]).append("\n");
			sbB.append(whites[i]).append("\n");
		}
		System.out.println(h + " " + w);
		System.out.print(sbA);
		System.out.print(sbB);
	}
}

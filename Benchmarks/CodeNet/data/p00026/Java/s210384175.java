import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
	private static int[][] paper = new int[10][10];

	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in), 64);
		String sLine;
		while ((sLine = reader.readLine()) != null) {
			droppingInk(sLine.charAt(0) & 0x0F, sLine.charAt(2) & 0x0F, sLine.charAt(4) & 0x0F);
		}
		calcResult();
	}

	private static void droppingInk(int x, int y, int size) {
		staining(x, y - 1);
		staining(x - 1, y);
		staining(x, y);
		staining(x + 1, y);
		staining(x, y + 1);
		if (size == 1) {
			return;
		}

		staining(x - 1, y - 1);
		staining(x + 1, y - 1);
		staining(x - 1, y + 1);
		staining(x + 1, y + 1);
		if (size == 2) {
			return;
		}

		staining(x, y - 2);
		staining(x - 2, y);
		staining(x + 2, y);
		staining(x, y + 2);
	}

	private static void staining(int x, int y) {
		if (x >= 0 && x < 10 && y >= 0 && y < 10) {
			paper[x][y]++;
		}
	}

	private static void calcResult() {
		int white = 0;
		int maxnoud = 0;
		for (int[] row : paper) {
			for (int colum : row) {
				if (colum == 0) {
					white++;
				} else if (colum > maxnoud) {
					maxnoud = colum;
				}
			}
		}
		System.out.println(white);
		System.out.println(maxnoud);
	}
}
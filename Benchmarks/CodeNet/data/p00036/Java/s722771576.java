import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class P0036 {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String line = "";

		char[][] plane = new char[8][8];
		int i = 0;

		while ((line = br.readLine()) != null) {
			if (line.length() == 8) {
				for (int j = 0; j < 8; j++) {
					plane[i][j] = line.charAt(j);
				}
				i++;
			}
			if (i == 8) {
				int[] top = getTop(plane);
				if (isA(plane, top)) {
					System.out.println("A");
				} else if (isB(plane, top)) {
					System.out.println("B");
				} else if (isC(plane, top)) {
					System.out.println("C");
				} else if (isD(plane, top)) {
					System.out.println("D");
				} else if (isE(plane, top)) {
					System.out.println("E");
				} else if (isF(plane, top)) {
					System.out.println("F");
				} else if (isG(plane, top)) {
					System.out.println("G");
				} else {
					System.out.println("What?");
				}
				i = 0;
			}
		}
	}

	public static int[] getTop(char[][] plane) {
		int r = -1;// row
		int c = -1;// column

		outer: for (int i = 0; i < 8; i++) {
			for (int j = 0; j < 8; j++) {
				if (plane[i][j] == '1') {
					r = i;
					c = j;
					break outer;
				}
			}
		}
		return new int[] { r, c };
	}

	public static boolean isA(char[][] plane, int[] top) {
		int r = top[0];// row
		int c = top[1];// column

		if (plane[r][c] == '1')
			if (plane[r][c + 1] == '1')
				if (plane[r + 1][c] == '1')
					if (plane[r + 1][c + 1] == '1')
						return true;
		return false;
	}

	public static boolean isB(char[][] plane, int[] top) {
		int r = top[0];// row
		int c = top[1];// column

		if (plane[r][c] == '1')
			if (plane[r + 1][c] == '1')
				if (plane[r + 2][c] == '1')
					if (plane[r + 3][c] == '1')
						return true;
		return false;
	}

	public static boolean isC(char[][] plane, int[] top) {
		int r = top[0];// row
		int c = top[1];// column

		if (plane[r][c] == '1')
			if (plane[r][c + 1] == '1')
				if (plane[r][c + 2] == '1')
					if (plane[r][c + 3] == '1')
						return true;
		return false;
	}

	public static boolean isD(char[][] plane, int[] top) {
		int r = top[0];// row
		int c = top[1];// column

		if (plane[r][c] == '1')
			if (plane[r + 1][c - 1] == '1')
				if (plane[r + 1][c] == '1')
					if (plane[r + 2][c - 1] == '1')
						return true;
		return false;
	}

	public static boolean isE(char[][] plane, int[] top) {
		int r = top[0];// row
		int c = top[1];// column

		if (plane[r][c] == '1')
			if (plane[r][c + 1] == '1')
				if (plane[r + 1][c + 1] == '1')
					if (plane[r + 1][c + 2] == '1')
						return true;
		return false;
	}

	public static boolean isF(char[][] plane, int[] top) {
		int r = top[0];// row
		int c = top[1];// column

		if (plane[r][c] == '1')
			if (plane[r + 1][c] == '1')
				if (plane[r + 1][c + 1] == '1')
					if (plane[r + 2][c + 1] == '1')
						return true;
		return false;
	}

	public static boolean isG(char[][] plane, int[] top) {
		int r = top[0];// row
		int c = top[1];// column

		if (plane[r][c] == '1')
			if (plane[r][c + 1] == '1')
				if (plane[r + 1][c - 1] == '1')
					if (plane[r + 1][c] == '1')
						return true;
		return false;
	}
}
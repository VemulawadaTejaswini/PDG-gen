import java.util.Scanner;

class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int[][] c = new int[3][3];

		for (int i = 0; i < c.length; i++) {
			for (int j = 0; j < c[i].length; j++) {
				c[i][j] = sc.nextInt();
			}
		}

		int[] a = new int[3];
		int[] b = new int[3];

		for (int i = 0; i < b.length; i++) {
			b[i] = c[0][i];
		}

		for (int i = 1; i < a.length; i++) {
			a[i] = c[i][0] - b[0];
		}

		boolean jdg = true;
		outer:
		for (int i = 0; i < c.length; i++) {
			for (int j = 0; j < c[i].length; j++) {
				if (!(jdg = (a[i] + b[j] == c[i][j])))
					break outer;
			}
		}

		System.out.println(jdg ? "Yes" : "No");

		sc.close();
	}
}

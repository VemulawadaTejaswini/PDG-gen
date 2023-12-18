import java.util.Scanner;

public class Main {
	public static void main(String[] args) throws Exception {
		Scanner sc = new Scanner(System.in).useDelimiter("(,|\r\n|\r|\n)");
		int[] c = new int[14];
		int[] n = new int[5];
		while (sc.hasNextInt()) {
			for (int i = 0; i < 14; i++)
				c[i] = 0;
			for (int i = 0; i < 5; i++)
				n[i] = 0;
			for (int i = 0; i < 5; i++){
				int a = sc.nextInt();
				c[a - 1]++;
			}
			for (int i = 0; i < 13; i++)
				n[c[i]]++;
			c[13] = c[0];
			int j = 13;
			while (j > 3 && c[j] <= 0)
				j--;
			if (n[4] > 0) {
				System.out.println("four card");
			} else if (n[3] > 0 && n[2] > 0) {
				System.out.println("full house");
			} else if (j > 3 && c[j] >0 &&c[j - 1] > 0 && c[j - 2] > 0 && c[j - 3] > 0 && c[j - 4] > 0) {
				System.out.println("straight");
			} else if (n[3] > 0) {
				System.out.println("three card");
			} else if (n[2] > 1) {
				System.out.println("two pair");
			} else if (n[2] > 0) {
				System.out.println("one pair");
			} else {
				System.out.println("null");
			}
		}
	}
}
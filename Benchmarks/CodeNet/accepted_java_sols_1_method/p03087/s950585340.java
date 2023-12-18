import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int q = sc.nextInt();
		char[] acgt = sc.next().toCharArray();
		int[] cArray = new int[n];
		int count = 0;

		for (int i = 0; i < n - 1; i++) {
			if (acgt[i] == 'A' && acgt[i + 1] == 'C') {
				count++;
			}
			cArray[i + 1] = count;
		}

		for (int j = 0; j < q; j++) {
			int l = sc.nextInt() - 1;
			int r = sc.nextInt() - 1;
			System.out.println(cArray[r] - cArray[l]);
		}
		sc.close();
	}
}

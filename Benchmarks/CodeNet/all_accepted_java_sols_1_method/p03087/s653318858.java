import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int q = sc.nextInt();
		char[] S = sc.next().toCharArray();
		int[] count = new int[n + 1];
		for (int i = 0; i < count.length - 1; i++) {
			if (i + 1 < n && S[i] == 'A' && S[i + 1] == 'C') {
				count[i + 1] = count[i] + 1;
			} else {
				count[i + 1] = count[i];
			}
		}
		for (int i = 0; i < q; i++) {
			int l = sc.nextInt() - 1;
			int r = sc.nextInt() - 1;
			System.out.println(count[r] - count[l]);
		}
		sc.close();
	}
}
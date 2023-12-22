import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner stdIn = new Scanner(System.in);
		int w = stdIn.nextInt();
		int[] a = new int[w+1];
		for (int i = 1; i <= w; i++)
			a[i] = i;
		int s = stdIn.nextInt();
		for (; s != 0; s--) {
			String[] S = stdIn.next().split(",");
			int l = Integer.parseInt(S[0]);
			int r = Integer.parseInt(S[1]);
			int t = a[l];
			a[l] = a[r];
			a[r] = t;
		}
		for (int i = 1; i <= w; i++)
			System.out.println(a[i]);

	}
}
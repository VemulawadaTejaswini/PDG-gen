import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int X = sc.nextInt();
		int[] L = new int[N];
		for(int i = 0; i < N; i++) {
			L[i] = sc.nextInt();
		}
		sc.close();
		int r = 1;
		int d = 0;
		for(int i = 0; i < N; i++) {
			d += L[i];
			if(d <= X) r++;
			// System.out.println((i + 1) + " d = " + d + " r = " + r);
		}
		System.out.println(r);
	}
}

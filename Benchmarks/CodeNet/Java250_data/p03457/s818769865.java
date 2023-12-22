import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int[] T = new int[N];
		int[] X = new int[N];
		int[] Y = new int[N];
		for(int i = 0;i < N;i++) {
			T[i] = sc.nextInt();
			X[i] = sc.nextInt();
			Y[i] = sc.nextInt();
			if(!(T[i]%2==(X[i] + Y[i])%2)
					|| X[i] + Y[i] > T[i]) {
				System.out.println("No");
				sc.close();
				return;
			}
		}
		sc.close();
		System.out.println("Yes");
	}
}
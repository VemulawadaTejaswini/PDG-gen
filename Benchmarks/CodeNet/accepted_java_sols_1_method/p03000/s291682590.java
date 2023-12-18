import java.util.Scanner;

class Main{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt(), X = sc.nextInt();
		int[] L = new int[N];
		for(int i = 0; i < N; i++) L[i] = sc.nextInt();
		int D = 0;
		int ans = 1;
		for(int i = 0; i < N; i++) {
			D = D + L[i];
			if(D <= X) ans++;
		}
		System.out.println(ans);
	}
}
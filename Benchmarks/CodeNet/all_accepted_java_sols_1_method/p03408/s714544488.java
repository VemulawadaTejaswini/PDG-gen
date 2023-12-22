import java.util.Scanner;

class Main{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		String[] s = new String[N];
		for(int i = 0; i < N; i++) s[i] = sc.next();

		int M = sc.nextInt();
		String[] t = new String[M];
		for(int i = 0; i < M; i++) t[i] = sc.next();

		int X = 0;
		for(int i = 0; i < N; i++) {
			int sum = 0;
			for(int j = 0; j < N; j++) {
				if(s[j].equals(s[i])) sum++;
			}
			for(int j = 0; j < M; j++) {
				if(t[j].equals(s[i])) sum--;
			}
			X = Math.max(X, sum);
		}

		System.out.println(X);
	}
}


public class Main {
	public static void main(String args[]) {
		java.util.Scanner sc = new java.util.Scanner(System.in);
		int N = sc.nextInt();
		String S[] = sc.next().split("");
		String T[] = sc.next().split("");

		for (int i = 0; i < N; i++) {
			System.out.print(S[i] + T[i]);
		}


	}
}
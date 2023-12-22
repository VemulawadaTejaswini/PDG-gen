import java.util.Scanner;

public class Main {
	public static void main(String[] args) throws Exception {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int Q = sc.nextInt();
		String S = sc.next();

		int l[] = new int[Q];
		int r[] = new int[Q];

		for (int i = 0; i < Q; i++) {
			l[i] = sc.nextInt();
			r[i] = sc.nextInt();
		}

		int ans[] = new int[Q];
		int t[] = new int[N+1];
		t[0] =  0;
		for (int i = 1; i < N; i++) {
			if (S.substring(i-1, i+1).equals("AC")) {
				t[i] = t[i-1] + 1;
			} else {
				t[i] = t[i-1];
			}
		}

		for (int i = 0; i < ans.length; i++) {
			System.out.println(t[r[i]-1]-t[l[i]-1]);
		}
	}
}

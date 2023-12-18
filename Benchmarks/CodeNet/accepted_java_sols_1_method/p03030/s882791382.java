import java.util.Scanner;

class Main {
    public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);

	int N = sc.nextInt();
	String S[] = new String[N];
	int P[] = new int[N];
	int x[] = new int[N];
	for (int i = 0; i < N; i++) {
	    S[i] = sc.next();
	    P[i] = sc.nextInt();
	    x[i] = i;
	}

	for (int i = 0; i < N - 1; i++) {
            for (int j = N - 1; j > i; j--) {
		if (S[j - 1].compareTo(S[j]) > 0) {
		    String tmp_s1 = S[j - 1];
		    S[j - 1] = S[j];
		    S[j] = tmp_s1;

		    int tmp_p1 = P[j - 1];
		    P[j - 1] = P[j];
		    P[j] = tmp_p1;

		    int tmp_x1 = x[j - 1];
		    x[j - 1] = x[j];
		    x[j] = tmp_x1;
		} else if (S[j - 1].compareTo(S[j]) == 0) {
		    if (P[j - 1] < P[j]) {
			String tmp_s2 = S[j - 1];
			S[j - 1] = S[j];
			S[j] = tmp_s2;

			int tmp_p2 = P[j - 1];
			P[j - 1] = P[j];
			P[j] = tmp_p2;

			int tmp_x2 = x[j - 1];
			x[j - 1] = x[j];
			x[j] = tmp_x2;
		    }
		}
	    }
	}

	for (int i = 0; i < N; i++)
	    System.out.println(x[i] + 1);
    }
}
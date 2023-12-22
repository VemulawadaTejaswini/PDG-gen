import java.util.Scanner;

class Main {
    public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);

	int N, Q;
	N = sc.nextInt();
	Q = sc.nextInt();
	char S[] = (sc.next()).toCharArray();
	int l[] = new int[Q];
	int r[] = new int[Q];
	for (int i = 0; i < Q; i++) {
	    l[i] = sc.nextInt();
	    r[i] = sc.nextInt();
	}

	int t[] = new int[N];
	t[0] = 0;
	for (int i = 1; i < N; i++) {
	    if (S[i] == 'C' && S[i - 1] == 'A') {
		t[i] = t[i - 1] + 1;
	    } else {
		t[i] = t[i - 1];
	    }
	}

	for (int i = 0; i < Q; i++) {
	    System.out.println(t[r[i] - 1] - t[l[i] - 1]);
	}
	
    }
}
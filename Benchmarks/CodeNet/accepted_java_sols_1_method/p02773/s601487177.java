import java.util.Arrays;
import java.util.Scanner;

class Main {
    public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);

	int N = sc.nextInt();
	String S[] = new String[N];
	for (int i = 0; i < N; i++)
	    S[i] = sc.next();

	Arrays.sort(S);

	int max = 1;
	int sum = 1;
	String check = S[0];
	for (int i = 1; i < N; i++) {
	    if (check.equals(S[i])) {
		sum++;

		if (sum > max)
		    max = sum;
	    } else {
		check = S[i];
		sum = 1;
	    }
	}

	if (max == 1) {
	    for (int i = 0; i < N; i++)
		System.out.println(S[i]);
	} else {
	    check = S[0];
	    sum = 1;
	    for (int i = 1; i < N; i++) {
		if (check.equals(S[i])) {
		    sum++;

		    if (sum == max)
			System.out.println(S[i]);
		} else {
		    check = S[i];
		    sum = 1;
		}
	    }
	}
		
    }
}
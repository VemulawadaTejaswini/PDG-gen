import java.util.*;

public class Main {
    public static void main (String [] args) {
	Scanner in = new Scanner(System.in);

	int n = in.nextInt();
	int [] S = new int [n];
	for (int i = 0 ; i < n ; i++) {
	    S[i] = in.nextInt();
	}

	int q = in.nextInt();
	int [] T = new int [q];
	for (int i = 0 ; i < q ; i++) {
	    T[i] = in.nextInt();
	}

	Arrays.sort(S);
	Arrays.sort(T);
	System.out.println(solve(S,T));
    }

    public static int solve (int [] a, int [] b) {
	int count = 0;

	for (int i = 0, j = 0 ; ;) {
	    if (i >= a.length || j >= b.length) {
		break;
	    }

	    if (a[i] == b[j]) {
		count++;
		i++; j++;
	    } else if (a[i] > b[j]) {
		j++;
	    } else {
		i++;
	    }
	}
	return count;
    }
}
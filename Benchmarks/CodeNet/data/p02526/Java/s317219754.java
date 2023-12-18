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
	int n = a.length, q = b.length;

	for (int i = 0 ; i < q ; i++) {
	    int l = 0, r = n-1;
	    
	    while (l < r) {
		int mid = (l + r) / 2;
        
		if (a[mid] < b[i]) {
		    l = mid+1;
		} else if(a[mid] > b[i]) {
		    r = mid;
		} else {
		    count++;
		    break;
		}
	    }
	}

	return count;
    }
}
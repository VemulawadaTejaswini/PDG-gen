import java.util.*;
class Main {
    public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	int n = Integer.parseInt(sc.next());
	long[] a = new long[n+1];
	for(int i = 0; i<n; i++) {
	    a[i] = Long.parseLong(sc.next());
	}

	long sum = 0;
	int right = 0;
	int left = 0;
	long ans = 0;

	for(left = 0; left<n; left++) {
	    while(right < n &&(sum ^ a[right]) == (sum + a[right])) {
		sum += a[right];
		right++;
	    }
	    ans += right - left;
	    if(left == right) ++right;
	    else {
		sum -= a[left];
	    }
	}

	System.out.println(ans);
    }
}
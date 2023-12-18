import java.util.*;
class Main {
    public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	int N = sc.nextInt();
	long[] a = new long[N+1];
	for(int i = 2; i<=N; i++) {
	    int k = i;
	    for(int j = 2; j<=i && k>1; j++) {
		while(k % j == 0) {
		    a[j] = a[j] + 1;
		    k=k/j;
		}
	    }
	}
	long ans = 1;
	for(long e: a) {
	    ans *= (e+1);
	    ans %= 1000000007;
	}
	System.out.println(ans);
    }
}
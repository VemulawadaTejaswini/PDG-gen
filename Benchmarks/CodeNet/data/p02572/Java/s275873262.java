import java.util.*;

public class Main {
    public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	int n = sc.nextInt();
	int[] a = new int[n];
	long wa = 0;
	for (int i=0; i<n; i++) {
	    a[i] = sc.nextInt();
	    wa += a[i];
	}
	long sum = 0;
	for (int i=0; i<n-1; i++) {
	    wa -= a[i];
	    sum = (sum + a[i] * wa) % 1000000007;
	}
	System.out.print(sum);
	
    }
}

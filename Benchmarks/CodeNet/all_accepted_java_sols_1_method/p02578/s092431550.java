import java.util.*;

public class Main {
    public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	int n = sc.nextInt();
	int[] a = new int[n];
	for (int i=0; i<n; i++) a[i] = sc.nextInt();
	int low = a[0];
	long sum = 0;
	for (int i=1; i<n; i++) {
	    if (low <= a[i]) low = a[i];
	    else {
		sum = sum + low - a[i];
	    }
	}
	System.out.print(sum);
    }
}

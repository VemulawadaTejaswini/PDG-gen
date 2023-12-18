import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
	    Scanner sc = new Scanner(System.in);
	    int n = sc.nextInt();
	    long[] a = new long[n];
	    long sum = 0;
	    int mod = (int)Math.pow(10, 9) + 7;
	    sc.nextLine();

	    for (int i = 0; i < n; i++) {
	    	a[i] = sc.nextInt();
	    	for (int j = 0; j < i; j++) {
	    		sum += (a[i] * a[j]) % mod;
	    		//System.out.println(i + ":" + j);
	    	}
	    }
	    System.out.println(sum % mod);
	}
}
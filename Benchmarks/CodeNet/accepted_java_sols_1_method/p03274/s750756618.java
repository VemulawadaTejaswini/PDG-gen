import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int k = sc.nextInt();
		int c[] = new int[n];
	
		for (int i=0;i<n;i++) {
			c[i] = sc.nextInt();
			
		}
		
		int min = Integer.MAX_VALUE;
		
		for (int i=0;i<n;i++) {
			if (i>=k-1) min = Math.min(min, Math.abs(c[i]-c[i-k+1])+Math.abs(c[i]));
			if (i<n-k+1) min = Math.min(min, Math.abs(c[i]-c[i+k-1])+Math.abs(c[i]));
		}
		System.out.println(min);

	}

}

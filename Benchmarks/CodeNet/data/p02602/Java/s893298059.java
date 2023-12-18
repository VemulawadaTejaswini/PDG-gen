import java.util.*;

class Main1{
	public static void main(String args[]){
		Scanner sc = new Scanner(System.in);
		long n;
		long k;
		n = sc.nextInt();
		k = sc.nextInt();
		long a[] = new long[(int)n];
		long mae = 1;
		for(int i = 0; i < n; i++){
			a[i] = sc.nextInt();
		}
		for(int i = 0; i < k; i++){
			mae *= a[i];
		}
		for(long i = k; i < n; i++){
			long now = mae;
			now = now / a[(int)(i-k)] * a[(int)i];
			System.out.println((now > mae ? "Yes" : "No"));
			mae = now;
		}
	}
}

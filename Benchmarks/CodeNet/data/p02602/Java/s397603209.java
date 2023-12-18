import java.util.*;

class Main1{
	public static void main(String args[]){
		Scanner sc = new Scanner(System.in);
		int n;
		int k;
		n = sc.nextInt();
		k = sc.nextInt();
		long a[] = new long[n];
		long mae = 1;
		for(int i = 0; i < n; i++){
			a[i] = sc.nextInt();
		}
		for(int i = 0; i < k; i++){
			mae *= a[i];
		}
		for(int i = k; i < n; i++){
			long now = mae;
			now = now / a[(int)(i-k)] * a[i];
			System.out.println((now > mae ? "Yes" : "No"));
			mae = now;
		}
	}
}

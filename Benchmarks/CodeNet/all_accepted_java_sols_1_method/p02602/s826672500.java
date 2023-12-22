import java.util.*;

public class Main {
	public static void main(String[] args) {
		Scanner scan =  new Scanner(System.in);
		
		int n = scan.nextInt();
		int k = scan.nextInt();
		int a[] = new int[n];
		long ans  = 0;
		for(int i=0;i<n;i++) {
			a[i] = scan.nextInt();
		}
		
		for(int i=0;i<n;i++) {
			ans += a[i];
			if(i>=k) {
				if(ans-a[i-k] > ans-a[i]) {
					System.out.println("Yes");
				}else {
					System.out.println("No");
				}
				
				ans -= a[i-k];
			}
		}
		
		

	}

}

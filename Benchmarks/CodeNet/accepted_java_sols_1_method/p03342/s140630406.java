import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int[] a = new int[n];
		for (int i=0;i<n;i++) {
			a[i] = sc.nextInt();
		}
		
		int i=0;
		int j=0;
		int tmp = 0;
		
		long ans = 0;
		
		 while (i<=n-1) {
			if ((tmp & a[i]) == 0) {
				ans += (i-j+1);
				tmp |= a[i];
				i++;
			} else {
				tmp &= (~a[j]);
				j++;
			}
		}
		 
		 System.out.println(ans);

	}

}

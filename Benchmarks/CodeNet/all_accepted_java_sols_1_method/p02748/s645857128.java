
import java.util.Scanner;

public class Main {

	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int m = sc.nextInt();
		int k = sc.nextInt();
		
		int[] a = new int[n];
		int[] b = new int[m];

		int mina = 999999999;
		int minb = 999999999;
		int ans;
		
		for(int i = 0; i < n; i++)
		{
			a[i] = sc.nextInt();
			mina = Math.min(a[i], mina);
		}
		
		for(int i = 0; i < m; i++)
		{
			b[i] = sc.nextInt();
			minb = Math.min(b[i], minb);
		}
		ans = mina + minb;
		
		for(int i = 0; i < k; i++)
		{
			int ca = sc.nextInt()-1;
			int cb = sc.nextInt()-1;
			int c = sc.nextInt();
			ans = Math.min(ans, a[ca]+b[cb]-c);
		}
		System.out.println(ans);

	}

}

import java.util.Scanner;

public class Main
{
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int m = sc.nextInt();
		String str = sc.nextLine();
		int [] h = new int [n];
		int [] f = new int [n];
		for (int i=0; i<n; i++) {
			h[i] = sc.nextInt();
		}
		str = sc.nextLine();
		for (int i=0; i<m; i++) {
			int a = sc.nextInt();
			int b = sc.nextInt();
			if (h[a-1]>h[b-1]) {
				f[b-1]=1;
			} else if (h[a-1]<h[b-1]) {
				f[a-1]=1;
			} else {
				f[b-1]=1;
				f[a-1]=1;
			}
			str = sc.nextLine();
		}
		sc.close();
		int ans = 0;
		for (int i=0; i<n; i++) {
			if (f[i] == 0) ans+=1;
		}
		System.out.println(ans);
	}
}

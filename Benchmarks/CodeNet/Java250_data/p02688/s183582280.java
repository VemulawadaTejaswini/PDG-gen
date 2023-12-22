import java.util.Scanner;

public class Main
{
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int k = sc.nextInt();
		String str = sc.nextLine();
		int [] a = new int[n];
		for (int i=0; i<k; i++) {
			int d = sc.nextInt();
			str = sc.nextLine();
			for (int j=0; j<d; j++) {
				a[sc.nextInt() - 1] = 1;
			}
		}
		sc.close();
		int ans = 0;
		for (int i=0; i<n; i++) {
			if (a[i]== 0) {
				ans+=1;
			}
		}
		System.out.println(ans);
	}
}

import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;

public class Main
{
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int m = sc.nextInt();
		Integer[] a = new Integer[n];

		double total = 0;
		for (int i=0; i<n; i++) {
			a[i]=new Integer(sc.nextInt());
			total += a[i];
		}
		sc.close();		
		String ans = "Yes";
		Arrays.sort(a, Collections.reverseOrder());

		for (int i=0; i<m; i++) {
			if (a[i]<total/(m*4)) {
				ans = "No";
				break;
			}
		}
		System.out.println(ans);
	}
}

import java.util.Arrays;
import java.util.Scanner;

public class Main
{
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		int b = sc.nextInt();
		String tmp = sc.nextLine();
		Integer [] p = new Integer[a];
		for (int i=0; i<a; i++) {
			p[i]= sc.nextInt();
		}
		Arrays.sort(p);
		int ans = 0;
		for (int i=0; i<b; i++) {
			ans +=p[i];
		}

		sc.close();
		System.out.println(ans);
	}
}

import java.util.*;

public class Main {
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		int K = sc.nextInt();
		int T = sc.nextInt();
		int[] a = new int[T];
		for(int i = 0; i < T; i++) a[i] = sc.nextInt();
		sc.close();
		int max = a[0];
		for(int i = 1; i < T; i++)
		{
			if(a[i] > max) max = a[i];
		}
		int result = 0;
		if(2 * max > K + 1)
		{
			result = 2 * max - K - 1;
		}
		System.out.println(result);
	}
}
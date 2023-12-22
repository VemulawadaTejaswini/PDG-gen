import java.util.Scanner;
import java.util.Arrays;
class Main
{
	public static void main(String args[])
	{
		Scanner sc = new Scanner(System.in);
		int W[] = new int[10];
		int K[] = new int[10];
		for (int i = 0; i < 10; i++)
			W[i] = sc.nextInt();
		for (int i = 0; i < 10; i++)
			K[i] = sc.nextInt();
		Arrays.sort(W);
		Arrays.sort(K);
		int totalW = 0, totalK = 0;
		for (int i = 7; i < 10; i++)
			totalW += W[i];
		for (int i = 7; i < 10; i++)
			totalK += K[i];
		System.out.printf("%d %d\n", totalW, totalK);
	}
}
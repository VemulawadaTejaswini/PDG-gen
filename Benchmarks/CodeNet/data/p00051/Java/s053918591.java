import java.util.Scanner;
import java.util.Arrays;

class Main
{
	public static void main(String args[])
	{
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		for (int i = 0; i < n; i++)
		{
			char num[] = sc.next().toCharArray();
			Arrays.sort(num);
			String str = new String(num);
			Scanner minNumSc = new Scanner(str);
			int min = minNumSc.nextInt();
			Scanner maxNumSc = new Scanner((new StringBuffer(str).reverse()).toString());
			int max = maxNumSc.nextInt();
			System.out.println(max - min);
		}
	}
}
import java.util.Arrays;
import java.util.Scanner;

public class Main
{
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		for(;N-->0;)
		{
			int[] l = new int[3];
			for (int i = 0; i < 3; i++) l[i] = sc.nextInt();
			Arrays.sort(l);
			System.out.println(lensq(l[0], l[1]) == sq(l[2]) ? "YES" : "NO");
		}
	}
	
	private static int lensq(int x, int y) { return sq(x) + sq(y); }
	private static int sq(int n) { return n * n; }
}
import java.util.Arrays;
import java.util.Scanner;

public class Main
{
	public static void main(String arg[])
	{
		Scanner in = new Scanner(System.in);
		int a[] =new int[3];
		a[0]=in.nextInt();
		a[1]=in.nextInt();
		a[2]=in.nextInt();
		Arrays.sort(a);
		int d = Math.min(in.nextInt(), in.nextInt());
		System.out.println(a[0]+d-50);
	}

}
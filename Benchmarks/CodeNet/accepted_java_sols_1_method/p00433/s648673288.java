import java.util.Scanner;

public class Main
{
	public static void main(String arg[])
	{
		Scanner sc = new Scanner(System.in);
		int a[]=new int [4];
		int b[]=new int [4];
		int sum1=0;
		int sum2=0;

		for(int i=0; i<4;i++)
			sum1 += sc.nextInt();
		for(int i=0; i<4;i++)
			sum2 += sc.nextInt();
		if(sum1>=sum2)
			System.out.println(sum1);
		else
			System.out.println(sum2);
	}

}
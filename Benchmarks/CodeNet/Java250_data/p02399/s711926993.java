import java.util.Scanner;


public class Main
{

	public static void main(String[] args)
	{
		Scanner in =new Scanner(System.in);
		int a,b;
		double f;
		a=in.nextInt();
		b=in.nextInt();
		f=(double)a/b;
		
		System.out.printf("%d %d %1.5f",(a/b),(a%b),f);

	}

}
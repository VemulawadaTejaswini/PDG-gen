import java.util.Scanner;

public class Main 
{
	public static void main(String[] args)
	{
	Scanner sc = new Scanner(System.in);
	long N = sc.nextInt();
	long D = sc.nextInt();
	
	long X,Y,D1,F=0;
	for (long i =0 ;i<N;i++)
	{
		X=sc.nextInt();
		Y=sc.nextInt();
		D1=X*X +Y*Y;
		if(D1<=(D*D))
		{
		F++;	
		}
	}
	System.out.println(F);
	}
}

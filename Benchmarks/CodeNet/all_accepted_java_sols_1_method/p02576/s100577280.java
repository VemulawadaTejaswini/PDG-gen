import java.util.*;
class Main
{
	public static void main(String []args)
	{
		Scanner scan = new Scanner(System.in);
		int N,X,T;
		N = scan.nextInt();
		X = scan.nextInt();
		T = scan.nextInt();
		
		int count  = N/X;
		
		if(N%X == 0)
		{
			System.out.print(count*T);
		}
		else
		{
			System.out.print((count+1)*T);
		}
	}
}
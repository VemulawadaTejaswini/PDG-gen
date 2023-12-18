import java.util.*;
class Solution
{
	public static void main(String []args)
	{
		Scanner scan = new Scanner(System.in);
		int N,X,T;
		N = scan.nextInt();
		X = scan.nextInt();
		T = scan.nextInt();
		
		int count  = N/X;
		System.out.print((count+1)*T);
	}
}
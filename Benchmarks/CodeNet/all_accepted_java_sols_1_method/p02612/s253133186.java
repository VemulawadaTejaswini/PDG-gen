import java.util.*;

class Main
{
	public static void main(String args[]) throws Exception
	{
		Scanner in = new Scanner(System.in);
		int n=in.nextInt();
		int ans=n%1000;
		if(ans!=0)
			ans=-ans+1000;
		System.out.println(ans);
	}
}
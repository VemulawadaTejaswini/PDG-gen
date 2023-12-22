import java.util.Scanner;

public class Main 
{
	public static void main(String args[])
	{
		Scanner sc = new Scanner(System.in);
		int a,b;
		int ans;
		a=sc.nextInt();
		b=sc.nextInt();
		ans=a*b;
		if(ans%2==1)
			System.out.println("Yes");
		else
			System.out.println("No");
	}
}

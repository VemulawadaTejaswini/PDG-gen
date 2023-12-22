import java.util.Scanner;

public class Main 
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		
		int th = sc.nextInt();
		int ts = sc.nextInt();
		
		int ah = sc.nextInt();
		int as = sc.nextInt();
		
		int tm = ah%ts;
		int t  = ah/ts;
		if(tm > 0)
		{
			t++;
		}
		
		int am = th%as;
		int a  = th/as;
		if(am > 0)
		{
			a++;
		}
		
		if(t <= a)
		{
			System.out.println("Yes");
		}
		else
		{
			System.out.println("No");
		}
		
	
		
		sc.close();
		
		

	}

}

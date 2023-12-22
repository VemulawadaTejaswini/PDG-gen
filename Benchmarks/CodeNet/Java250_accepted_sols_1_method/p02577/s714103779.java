
import java.util.*;

public class Main {

	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		String n=sc.next();
	//System.out.println(n.length());
		int sum=0;
		for(int i=0;i<n.length();i++)
		{
			sum+=(int)n.charAt(i)-48;
		}
		
		if(sum%9==0) System.out.println("Yes");
		else System.out.println("No");
		
	}
}

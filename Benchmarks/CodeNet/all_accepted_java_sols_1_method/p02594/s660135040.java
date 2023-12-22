import java.util.ArrayList;
import java.util.*;
  public class Main
{
	public static void main (String[] args)
	 {
		Scanner sc=new Scanner(System.in);
		int t=1;
		while(t>0) 
		{
			t--;
			int n=sc.nextInt();
			if(n>=30)
				System.out.println("Yes");
			else
				System.out.println("No");
		}
	}
}
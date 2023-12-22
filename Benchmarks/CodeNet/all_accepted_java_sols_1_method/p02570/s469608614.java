
import java.util.*;

public class Main {

	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		int d=sc.nextInt();
		int t=sc.nextInt();
		int s=sc.nextInt();
		double time=(double)d/(double)s;
		if(t>=time) System.out.println("Yes");
		else System.out.println("No");
		
		
		//System.out.println(time);
	}
}

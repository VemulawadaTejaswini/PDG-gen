
import java.util.*;

public class Main {

	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		long extrac;
		long n=sc.nextLong();
		long m=sc.nextLong();
		if(m<2*n) System.out.println(m/2); 
		else
		{
			extrac=m-2*n;
			n+=(extrac/4);
			System.out.println(n);
			
		}
	
	}
}

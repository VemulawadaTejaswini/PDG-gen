import java.util.*;

public class Main
{
	public static void main(String[] args)
	{
		Scanner s=new Scanner(System.in);
		
		int a=s.nextInt();
		System.out.println(a+(int)Math.pow(a,2)+(int)Math.pow(a,3));
		s.close();
	}
}

import java.util.*;

public class Main
{
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		
		int a=sc.nextInt();
		if(a==25)
			System.out.println("Christmas");
		else if(a==24)
			System.out.println("Christmas Eve");
		else if(a==23)
			System.out.println("Christmas Eve Eve");
		else if(a==22)
			System.out.println("Christmas Eve Eve Eve");
		else
			System.out.println( "0");
	}
}
import java.lang.reflect.Array;
import java.math.*;
import java.util.*;
public class Main
{
	static Scanner sc=new Scanner(System.in);
	static final int MAX=1000000+5;
	public static void main(String[] args)
	{
		int n=sc.nextInt();
		if(n==25)
			System.out.println("Christmas");
		else if(n==24)
			System.out.println("Christmas Eve");
		else if(n==23)
			System.out.println("Christmas Eve Eve");
		else if(n==22)
			System.out.println("Christmas Eve Eve Eve");
	}
}
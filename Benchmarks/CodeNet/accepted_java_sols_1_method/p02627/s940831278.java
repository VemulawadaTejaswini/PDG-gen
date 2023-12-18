import java.util.*;

public class Main
{
	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		String str=sc.next();
		String bs=str.toUpperCase();
		String ss=str.toLowerCase();
		if(str.equals(bs))
		{
			System.out.println("A");
		}
		else if(str.equals(ss))
		{
			System.out.println("a");
		}
		sc.close();
	}
}

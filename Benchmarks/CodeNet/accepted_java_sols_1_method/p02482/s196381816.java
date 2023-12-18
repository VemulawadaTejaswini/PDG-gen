import java.util.Scanner;


public class Main
{
	public static void main(String[]args)
	{
		Scanner sc = new Scanner(System.in);
		int a=sc.nextInt(), b=sc.nextInt();
		sc.close();
		
		String  s="";
		if(a<b) s= "a < b";
		if(a>b) s= "a > b";
		if(a==b)s= "a == b";
		
		System.out.println(s);
	}
}
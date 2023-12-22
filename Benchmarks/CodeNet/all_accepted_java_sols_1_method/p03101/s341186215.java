import java.util.*;

public class Main
{
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		
		int a1=sc.nextInt();
		int a2=sc.nextInt();
		int a3=sc.nextInt();
		int a4=sc.nextInt();
		
		int a5=(Math.abs(a3-a1))*(Math.abs(a4-a2));
		System.out.println(a5);
	}
}
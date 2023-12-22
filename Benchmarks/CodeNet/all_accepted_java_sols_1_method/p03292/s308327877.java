import java.util.*;
 
public class Main
{
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		int a=sc.nextInt();
		int b=sc.nextInt();
		int c=sc.nextInt();
		
		int d=0,e=0,f=0;
		
		d=Math.abs(a-b);
		e=Math.abs(c-b);
		f=Math.abs(a-c);
		int aa=Math.max(d,e);
		System.out.println(Math.max(aa,f));
	}
}
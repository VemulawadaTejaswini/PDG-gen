import java.util.*;
import java.io.*;

public class Main
{
	public static void main(String [] Args)
	{
		Scanner in=new Scanner(System.in);
		int p=in.nextInt();
		int q=in.nextInt();
		int r=in.nextInt();
		int a=q+Math.min(p,r);
		int b=p+Math.min(q,r);
		int c=r+Math.min(p,q);
		System.out.println(Math.min(a,Math.min(b,c)));
	}
}
	
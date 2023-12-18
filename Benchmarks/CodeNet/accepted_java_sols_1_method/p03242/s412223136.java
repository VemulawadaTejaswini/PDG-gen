import java.util.*;

public class Main
{
	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		int a=sc.nextInt();
		
		if(a==999)
			a=111;
		else if(a==991)
			a=119;
		else if(a==911)
			a=199;
		else if(a==919)
			a=191;
		else if(a==191)
			a=919;
		else if(a==111)
			a=999;
		else if(a==199)
			a=911;
		else if(a==119)
			a=991;
		else if(a==191)
			a=919;
		
		System.out.println(a);
	}
}	
import java.util.Scanner;

public class Main{
	public static void main(String[] args)
	{
		Scanner sc =new Scanner(System.in);
		int a=sc.nextInt();
		int b=sc.nextInt();
		int c=sc.nextInt();
		int d=sc.nextInt();
		int ab=a*b,cd=c*d,ans=0;

		if(ab>=cd) ans=ab;
		else ans=cd;
		
		System.out.println(ans);	
	}
	
} 
import java.util.*;

public class Main
{
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		int a,b,c,sum=0;
		a = sc.nextInt();
		b = sc.nextInt();
		c = sc.nextInt();
		
		if((a<c && c<b) || (a>c && c>b))
			System.out.print("Yes");
		else
			System.out.print("No");

	}
}
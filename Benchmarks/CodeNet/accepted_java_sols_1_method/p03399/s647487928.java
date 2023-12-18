import java.util.*;

public class Main{
	public static void main(String[] args)
	{
		Scanner sc =new Scanner(System.in);
		int a=sc.nextInt();
		int b=sc.nextInt();
		int c=sc.nextInt();
		int d=sc.nextInt();

		a=Math.min(a,b);
		c=Math.min(c,d);

		//結果を出力
		System.out.println(a+c);
	}
} 
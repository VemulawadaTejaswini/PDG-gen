import java.util.Scanner;

public class  Main{
	public static void main(String[] args)
	{
		Scanner sc =new Scanner(System.in);
		int a=sc.nextInt();
		int b=sc.nextInt();
		int c=sc.nextInt();
		int total=a*100+b*10+c;
		
		if(total%4==0) System.out.println("YES");
		else System.out.println("NO");
	}
} 
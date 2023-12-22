import java.util.Scanner;

public class Main{
	public static void main(String[] args)
	{
		Scanner scan =new Scanner(System.in);
		int a=scan.nextInt();
		int b=scan.nextInt();
		int c=scan.nextInt();
		int total;

		if(a==b && b==c) total=1;
		else if((a==b && b!=c)||(b==c && c!=a)||(a==c && b!=c)) total=2;
		else total=3;
		System.out.println(total);
	}
	
}
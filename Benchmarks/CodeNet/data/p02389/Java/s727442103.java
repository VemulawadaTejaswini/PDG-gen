import java.util.Scanner;
public class Main
{
	public static void main(String[] args)throws Exception
	{
		Scanner scan=new Scanner(System.in);
		

		int a=scan.nextInt();
		int b=scan.nextInt();
		
		System.out.print(a*b+" "+(a+b)*2);
	} 
}
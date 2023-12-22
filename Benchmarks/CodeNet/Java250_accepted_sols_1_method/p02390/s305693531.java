import java.util.Scanner;
public class Main
{
	public static void main(String args[])
	{
		int n,a,b,c;
		Scanner input = new Scanner(System.in);
		n = input.nextInt();
		System.out.println(n/3600 + ":" + (n%3600)/60 + ":" + n%60);
	}
}
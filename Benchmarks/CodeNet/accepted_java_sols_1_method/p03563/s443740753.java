import java.util.Scanner;
public class Main {
	public static void main(String[] args)	{
		Scanner scan=new Scanner(System.in);
		int a=scan.nextInt(),c=scan.nextInt();
		int b=(c<<1)-a;
		System.out.println(b);
	}
}
import java.util.Scanner;

public class Main
{
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		String str = sc.nextLine();

		String[] substr = str.split(" ", 0);

		String x = substr[0];
		String y = substr[1];
		String z = substr[2];
		sc.close();
		System.out.println(z+' '+x+' '+y );
	}
}
		

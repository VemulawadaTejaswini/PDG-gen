import java.util.Scanner;
public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		long a =  sc.nextLong();
		long b =  sc.nextLong();
		long x =  sc.nextLong();
		

		long min = a / x;
		long max = b / x;

		if( a % x == 0 && b % x == 0)
		{
			System.out.println((max - min + 1));
		}else if(a % x == 0)
		{
			System.out.println((max - min + 1));
		}else if(b % x == 0)
		{
			System.out.println((max - min));
		}
		else
		{
			System.out.println((max - min));
		}
	}



}

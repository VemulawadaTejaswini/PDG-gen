import java.util.Scanner;

public class Main{
	public static void main(String[] args){
		Scanner scan = new Scanner(System.in);
		long x = scan.nextLong();

		long temp500 = x / 500;
		x = x % 500;
		long temp5 = x / 5;

		System.out.println(temp500 * 1000 + temp5 * 5);

	}
}
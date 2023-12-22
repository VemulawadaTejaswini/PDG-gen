import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);

		long  num  = scan.nextLong();
		boolean flg = true;
		for(long i  = (long)Math.sqrt(num); i > 0 && flg; i--)
				if(num% i == 0) {
					System.out.println(i + num / i - 2);
					flg =  false;
				}
	}
}
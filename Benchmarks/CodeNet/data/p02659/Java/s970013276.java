
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);

		long a = sc.nextLong();
//		long b = (long)(sc.nextDouble()*100);
		double b = sc.nextDouble();

//		System.out.println(a*b/100);
		System.out.println((long)(a*b));
	}
}
import java.util.Scanner;
import static java.lang.Math.*;
import java.text.DecimalFormat;
public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		while(sc.hasNext()){
			long q = sc.nextLong();
			if (q < 0) break;
			double x = q/2.0;
			double e = 0.00001 * q;
			while (abs(pow(x,3) - q) >= e) {
				x = x - (pow(x,3) - q) / (3 * pow(x,2));
			}
			System.out.println(new DecimalFormat("#0.000000").format(x));
		}
	}
}
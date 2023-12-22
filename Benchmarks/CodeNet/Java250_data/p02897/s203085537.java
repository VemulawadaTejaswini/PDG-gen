import java.util.*;
import static java.lang.System.*;
import java.math.*;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int g = n / 2;
		double ans = (double)(n-g) / n;
		out.println(ans);

		
	}
}
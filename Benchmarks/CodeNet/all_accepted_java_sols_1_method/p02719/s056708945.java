
import java.util.*;

public class  Main{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		long n =sc.nextLong();
		long k =sc.nextLong();
		long min=n%k;

		System.out.println(Math.min(min, k-min));
		sc.close();
	}
}

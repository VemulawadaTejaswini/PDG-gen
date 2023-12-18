
import java.util.*;

class Main {


	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		long A = sc.nextLong();
		double B = sc.nextDouble();
		
		long ans = 0;
		ans = A * (long)B;
		double minB = B - (long)B;
		ans += (long)(A * minB);
		
		System.out.println(ans);

		
	}

}



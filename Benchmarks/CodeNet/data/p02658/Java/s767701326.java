
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		long result = 1;
		for(int i=0; i<n; i++) {
			long a = sc.nextLong();
			result *= a;
			if(result == 0) {
				break;
			}
		}
		if(result > 1000000000000000000L) {
			result = -1;
		}
		System.out.println(result);
	}

}

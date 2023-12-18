import java.util.*;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		long total = 1;

		for(int i=0;i<n;i++) {
			total *= sc.nextLong();
		}
		double limit = Math.pow(10, 18);
		if(total>Math.round(limit)) {
			total = -1;
		}
		System.out.println(String.valueOf(total));
	}

}
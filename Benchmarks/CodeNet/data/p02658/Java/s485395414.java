import java.util.*;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		long total = 1;

		for(int i=0;i<n;i++) {
			total *= sc.nextLong();
		}
		sc.close();
		long limit = (long) Math.pow(10, 18);
		System.out.println(limit);
		if(total>limit) {
			total = -1;
		}
		System.out.println(total);
	}

}

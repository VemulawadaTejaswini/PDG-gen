
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		long min = (long) Math.pow(10, 9);
		long max = 0;
		for(int i = 0; i < n; i++) {
			long tmp = sc.nextLong();
			min = Math.min(min, tmp);
			max = Math.max(max, tmp);
		}
		System.out.println(max - min);
	}

}

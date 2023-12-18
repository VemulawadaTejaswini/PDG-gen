import java.util.*;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		long min = Integer.MAX_VALUE, max = Integer.MIN_VALUE, sum = 0;
		
		int count = sc.nextInt();
		for(int i = 0; i < count; i++) {
			long t = sc.nextLong();
			if (t > max) {
				max = t;
			}
			if (t < min) {
				min = t;
			}
			sum += t;
		}
		
		System.out.println(min + " " + max + " " + sum);
	}
}


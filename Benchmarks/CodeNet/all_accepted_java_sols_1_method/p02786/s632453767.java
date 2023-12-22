import java.util.*;

public class Main {
	public static void main (String[] args) {
		Scanner sc = new Scanner(System.in);
		long h = sc.nextLong();
		long time = 1;
		long count = 0;
		while (h > 1) {
		    count += time;
		    h /= 2;
		    time *= 2;
		}
		count += time;
		System.out.println(count);
	}
}

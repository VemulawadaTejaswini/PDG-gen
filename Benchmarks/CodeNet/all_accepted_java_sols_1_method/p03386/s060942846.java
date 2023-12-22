import java.util.Scanner;
import java.util.TreeSet;

public class Main {
	public static void main(String[] args) {
		final Scanner sc = new Scanner(System.in);
		long a = sc.nextLong();
		long b = sc.nextLong();
		long k = sc.nextLong();
		TreeSet<Long> set = new TreeSet<>();
		for(long i = a; i <= b; i++) {
			if(i < a+k || i > b - k) {
				set.add(i);
			}
		}
		set.stream().forEach(System.out::println);
	}
}
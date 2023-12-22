import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		Set<Integer> numbers = new HashSet<>();
		for(int i = 0; i < n; i++) {
			int di = sc.nextInt();
			numbers.add(di);
		}
		System.out.println(numbers.size());
	}
}
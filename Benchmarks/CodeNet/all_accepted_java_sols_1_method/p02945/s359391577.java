import java.util.Comparator;
import java.util.Scanner;
import java.util.stream.Stream;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int a = Integer.parseInt(sc.next());
		int b = Integer.parseInt(sc.next());
		int ans1 = a + b;
		int ans2 = a - b;
		int ans3 = a * b;
		System.out.println(Stream.of(ans1, ans2, ans3).max(Comparator.naturalOrder()).get());

	}

}

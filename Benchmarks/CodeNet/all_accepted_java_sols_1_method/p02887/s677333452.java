import java.util.*;
import java.util.stream.*;

class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		sc.next();
		String s = sc.next();
		System.out.println(IntStream.range(1, s.length()).filter(i -> s.charAt(i - 1) != s.charAt(i)).count() + 1);
	}
}

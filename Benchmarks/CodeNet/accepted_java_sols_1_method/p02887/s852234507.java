import java.util.*;
import java.util.stream.*;

class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		sc.next();
		char[] s = sc.next().toCharArray();
		System.out.println(IntStream.range(1, s.length).filter(i -> s[i - 1] != s[i]).count() + 1);
	}
}

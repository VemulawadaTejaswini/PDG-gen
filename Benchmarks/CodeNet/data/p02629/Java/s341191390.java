import java.util.*;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Long n = sc.nextLong();
		StringBuilder sb = new StringBuilder();
		Map<Long, Character> map = new HashMap<>();
		for (char i = 'a'; i <= 'z'; i++) {
			map.put((long) (i - 'a' + 1), i);
		}
		while (n != 0) {
			Long t = n % 26;
			sb.insert(0, map.get(t));
			n = n / 26;
		}
		System.out.println(sb.toString());
	}
}







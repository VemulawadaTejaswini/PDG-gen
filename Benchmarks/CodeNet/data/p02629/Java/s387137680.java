import java.util.*;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Long n = sc.nextLong();
		n--;
		StringBuilder sb = new StringBuilder();
		while (n > 0) {
			sb.insert(0, (char) ('a' + n % 26));
			n = n / 26;
			n--;
		}
		System.out.println(sb.toString());
	}
}







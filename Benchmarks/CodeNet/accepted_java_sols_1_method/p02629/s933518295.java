import java.util.*;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Long n = sc.nextLong();
		StringBuilder sb = new StringBuilder();
		while (n > 0) {
			n--;
			sb.insert(0, (char) ('a' + n % 26));
			n = n / 26;
		}
		System.out.println(sb.toString());
	}
}







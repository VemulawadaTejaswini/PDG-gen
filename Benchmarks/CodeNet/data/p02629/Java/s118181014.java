import java.util.*;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Long n = sc.nextLong();
		StringBuilder sb = new StringBuilder();
		while (n > 0) {
			n--;
			int t = (int) (n % 26);
			sb.insert(0, (char) ('a' + t));
			n = n / 26;
		}
		System.out.println(sb.toString());
	}
}







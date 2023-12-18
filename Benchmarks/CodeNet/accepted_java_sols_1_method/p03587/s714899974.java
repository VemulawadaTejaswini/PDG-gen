import java.util.*;

public class Main {
	public static void main (String[] args) {
		Scanner sc = new Scanner(System.in);
		char[] arr = sc.next().toCharArray();
		int total = 0;
		for (char c : arr) {
			total += c - '0';
		}
		System.out.println(total);
	}
}

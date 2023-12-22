import java.util.*;

public class Main {
	public static void main (String[] args) {
		Scanner sc = new Scanner(System.in);
		char[] arr = sc.next().toCharArray();
		for (int i = 1; i < arr.length; i++) {
			if (arr[i] == arr[i - 1]) {
				System.out.println("Bad");
				return;
			}
		}
		System.out.println("Good");
	}
}

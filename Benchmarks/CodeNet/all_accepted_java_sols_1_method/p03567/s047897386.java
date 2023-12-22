import java.util.*;

public class Main {
	public static void main (String[] args) {
		Scanner sc = new Scanner(System.in);
		char[] arr = sc.next().toCharArray();
		for (int i = 1; i < arr.length; i++) {
			if (arr[i - 1] == 'A' && arr[i] == 'C') {
				System.out.println("Yes");
				return;
			}
		}
		System.out.println("No");
	}
}

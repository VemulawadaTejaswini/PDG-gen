import java.util.*;

public class Main {
	public static void main (String[] args) {
		Scanner sc = new Scanner(System.in);
		char[] arr = sc.next().toCharArray();
		for (int i = 0; i < arr.length - 1; i++) {
			if (arr[i] == arr[i + 1]) {
				System.out.println((i + 1) + " " + (i + 2));
				return;
			}
			if (i < arr.length - 2 && arr[i] == arr[i + 2]) {
				System.out.println((i + 1) + " " + (i + 3));
				return;
			}
		}
		System.out.println("-1 -1");
	}
}

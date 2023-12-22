import java.util.*;

public class Main {
	public static void main (String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int k = sc.nextInt();
		char[] arr = sc.next().toCharArray();
		arr[k - 1] = (char)(arr[k - 1] - ('A' - 'a'));
		System.out.println(arr);
	}
}

import java.util.Scanner;
public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int current = Integer.parseInt(sc.next());
		int end = Integer.parseInt(sc.next());
		int result = 0;
		for (; current <= end; current++) {
			char[] arr = Integer.toString(current).toCharArray();
			if (arr[0] == arr[4] && arr[1] == arr[3]) {
				result++;
			}
		}
		System.out.println(result);
	}
}


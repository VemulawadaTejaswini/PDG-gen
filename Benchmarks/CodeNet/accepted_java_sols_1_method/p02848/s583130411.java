import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		String s = sc.next();

		char[] arr = s.toCharArray();
		for (int i = 0; i < arr.length; i++) {
			arr[i] = (char) ((arr[i] + n - 65) % 26 + 65);
		}

		String ans = new String(arr);
		System.out.println(ans);

		sc.close();
	}
}

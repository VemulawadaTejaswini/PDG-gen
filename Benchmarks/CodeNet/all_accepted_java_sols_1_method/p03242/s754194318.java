import java.util.Scanner;
public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		char[] arr = String.valueOf(n).toCharArray();
		for (int i = 0; i < arr.length; i++) {
			if (arr[i] == '9') {
				arr[i] = '1';
			} else {
				arr[i] = '9';
			}
		}
		System.out.println(Integer.valueOf(new String(arr)));
	}
}
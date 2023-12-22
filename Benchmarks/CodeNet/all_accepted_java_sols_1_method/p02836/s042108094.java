import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		String s = "";
		Scanner sc = new Scanner(System.in);
		s = sc.next();
		int len = s.length();
		String[] ar = s.split("");
		int count = 0;
		for (int i = 0; i < len / 2; i++) {
			if (ar[i].equals(ar[len - i - 1]) == false) {
				count++;
			}
		}
		System.out.println(count);
	}
}

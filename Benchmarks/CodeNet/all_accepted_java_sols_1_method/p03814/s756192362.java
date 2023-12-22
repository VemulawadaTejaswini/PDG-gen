import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		String s = sc.next();
		int start = 0;
		int end = 0;
		String [] lists = s.split("");   ///sを配列に変換する

		for (int i = 0; i < s.length(); i++) {
			if (lists[i].equals("A")) {
				start = i;
				break;
			}
		}
		for (int i = s.length()-1; i >= 0; i--) {
			if (lists[i].equals("Z")) {
				end = i;
				break;
			}
		}
		System.out.println(Math.abs(end - start)+1);
	}
}

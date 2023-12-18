import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		char[] l1 = sc.nextLine().toCharArray();
		char[] l2 = sc.nextLine().toCharArray();

		int count = 0;
		for (int id = 0; id < l1.length; id++) {
			if (l1[id] != l2[id]) {
				count++;
			}
		}

		System.out.println(count);
	}
}

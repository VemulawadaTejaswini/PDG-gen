import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String[] strs = new String[3];

		for (int i = 0; i < 3; i++) {
			strs[i] = sc.next();
		}
		System.out.println(strs[0].substring(0, 1) + strs[1].substring(1, 2) + strs[2].substring(2));
		sc.close();
	}

}

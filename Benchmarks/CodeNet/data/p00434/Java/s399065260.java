import java.util.ArrayList;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		ArrayList<Integer> submit = new ArrayList<Integer>();
			for (int i = 0; i < 28; i++) {
				submit.add(sc.nextInt());
			}

		int cnt = 2;
		for (int i = 1; i <= 30 && cnt > 0; i++) {
			if (!submit.contains(i)) {
				System.out.println(i);
				cnt--;
			}
		}
		sc.close();
	}
}

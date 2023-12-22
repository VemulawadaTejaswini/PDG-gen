import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String[] w = sc.next().split("");
		for (int i = 0; i < w.length; i++) {
			if (!w[i].equals(".")) {
				int count = 0;
				String tem = w[i];
				for (int j = i; j < w.length; j++) {
					if (w[j].equals(tem)) {
						count++;
						w[j] = ".";
					}
				}
				if (count % 2 != 0) {
					System.out.println("No");
					return;
				}
			}
		}
		System.out.println("Yes");
	}
}
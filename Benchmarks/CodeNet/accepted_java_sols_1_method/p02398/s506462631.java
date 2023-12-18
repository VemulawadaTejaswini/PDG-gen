import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String line = sc.nextLine();
		String[] ss = line.split(" ");
		int a = Integer.parseInt(ss[0]);
		int b = Integer.parseInt(ss[1]);
		int c = Integer.parseInt(ss[2]);
		int cnt = 0;

		for (int i = a; i <= b; i++) {
			if (c % i == 0) {
				cnt++;
			}
		}
		System.out.println(cnt);
	}
}
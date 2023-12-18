import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int num;
		main: while (sc.hasNext()) {
			String str = sc.next();
			int sum = 0;
			for (int i=0; i < str.length(); i++) {
				num = Integer.parseInt(str.substring(i, i+1));
				if (i == 0 && num == 0) break main;
				sum += num;
			}
			System.out.println(sum);
		}
		sc.close();
	}
}
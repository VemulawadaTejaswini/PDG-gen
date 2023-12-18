import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String masu = sc.next();
		char[] masuList = masu.toCharArray();
		int count = 0;
		for(char a : masuList) {
			if (a == '1') {
				count = count + 1;
			}
		}
		System.out.println(count);

	}
}

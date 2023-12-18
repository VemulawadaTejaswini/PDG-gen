import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int n = scan.nextInt();
		String taro;
		String hanako;
		int point_taro = 0;
		int point_hanako = 0;
		for (int i = 0; i < n; i++) {
			taro = scan.next();
			hanako = scan.next();
			if (taro.compareTo(hanako) < 0) {
				point_hanako += 3;
			} else if (taro.compareTo(hanako) > 0) {
				point_taro += 3;
			} else {
				point_taro += 1;
				point_hanako += 1;
			}
		}
		System.out.println(point_taro + " " + point_hanako);
	}
}
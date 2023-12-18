import java.util.*;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		int b = sc.nextInt();
		int yen = 0;
		if (a < 6) {
			yen = 0;
		} else if (a > 5 & a < 13) {
			yen = b / 2;
		} else {
			yen = b;
		}
		System.out.println(yen);
	}
}
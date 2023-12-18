import java.util.*;

public class Main {
	public static void main(String... args) {
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		int b = sc.nextInt();
		int cnt = 0;
		for (int i = 1 ; i < b - a ; i++) {
			cnt = cnt + i;
		}
		System.out.println(cnt - a);
	}
}

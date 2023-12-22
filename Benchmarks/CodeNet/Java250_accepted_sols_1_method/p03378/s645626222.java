import java.util.*;

public class Main {
	public static void main(String... args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int m = sc.nextInt();
		int x = sc.nextInt();
		int cnt = 0;
		while (sc.hasNext()) {
			if (x < sc.nextInt()) {
				cnt++;
			} 
		}
		System.out.println(m / 2 >= cnt ? cnt : m - cnt);
	}
}
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int a = sc.nextInt();
		int b = sc.nextInt();

		int result = 0;

		for (int i = 1; i <= n; i++) {
			List<Integer> list = new ArrayList<>();
			int cnt = i;
			while(cnt > 0) {
				list.add(cnt%10);
				cnt /= 10;
			}
			
			int lcnt = 0;
			for (int l : list) {
				lcnt += l;
			}
			
			if (lcnt >= a && lcnt <= b) {
				result += i;
			}
		}
		System.out.println(result);
	}
}
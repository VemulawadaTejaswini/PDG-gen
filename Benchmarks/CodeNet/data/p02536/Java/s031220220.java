import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int m = sc.nextInt();
		int cnt = n - 1;
		List<Integer> list = new ArrayList<Integer>();
		for (int i = 0; i < m; i++) {
			sc.nextLine();
			int a = sc.nextInt();
			int b = sc.nextInt();
			list.add(a);
			list.add(b);
			if (list.contains(a) && list.contains(b)) {
			} else {
				cnt--;
			}
		}
		System.out.println(cnt);
	}
}

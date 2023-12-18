import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int x = sc.nextInt();
		int n = sc.nextInt();
		Set<Integer> p = new HashSet<Integer>();
		for (int i = 0; i < n; i++) {
			p.add(sc.nextInt());
		}

		boolean flag = true;
		int ans;
		int i = 0;
		while (flag) {
			ans = x - i;
			if (!p.contains(ans)) {
				System.out.println(ans);
				flag = false;
				break;
			}
			ans = x + i;
			if (!p.contains(ans)) {
				System.out.println(ans);
				flag = false;
				break;
			}
			i++;
		}

		sc.close();
	}

}

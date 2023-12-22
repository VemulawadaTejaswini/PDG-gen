import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class Main{

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int x = s.nextInt();
		int i = 0;
		int ans = 0;
		int ary[] = new int[x];
		for (i = 0; i < x; i++) {
			ary[i] = s.nextInt();
		}
		Set<Integer> list = new HashSet<Integer>();
		list.add(1);
		for (i = 1;;) {
			i = ary[i - 1];
			int na=list.size();
			list.add(i);
			ans++;
			if (i == 2) {
				break;
			} else if (list.size()==na) {
				ans = -1;
				break;
			}

		}
		System.out.println(ans);
	}
}
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class Main {
	private static Scanner sc = new Scanner(System.in);
	public static void main(String[] args) {
		int n = sc.nextInt();
		int c = sc.nextInt();
		int k = sc.nextInt();
		int[] a = new int[n];
		for (int i = 0;i < n;i++) a[i] = sc.nextInt();
		Arrays.sort(a);
		int ret = 0;
		List<Integer> list = new ArrayList<>();
		int s = 0;
		for (int i = 0;i < n;i++) {
			int tmp = a[i];
			if (list.size()==0) {
				s = tmp;
				list.add(tmp);
			} else if (tmp<=s+k&&list.size()<c) {
				list.add(tmp);
			} else {
				list.clear();
				list.add(tmp);
				s = tmp;
				ret++;
			}
		}

		if (list.size()>0) ret++;

		System.out.println(ret);
	}
}
import java.util.Scanner;
import java.util.*;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		ArrayList<Integer> num = new ArrayList<Integer>();
		for (int i = 0; i < N; i++) {
			int a = sc.nextInt();
			num.add(a);
		}
		int cnt = 0;
		while (true) {
			boolean x = false;
			for (int i = 0; i < N; i++) {
				if (num.get(i) % 2 == 0) {
					int a = num.get(i) / 2;
					num.remove(i);
					num.add(i, a);
				} else {
					x = true;
					break;
				}
			}
			if (x == true) {
				break;
			}
			cnt++;
		}
		System.out.println(cnt);
		sc.close();
	}

}
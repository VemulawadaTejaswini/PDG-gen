import java.util.*;
public class Main {
	public static void main(String[] args) {
		ArrayList<Integer> list = new ArrayList<Integer>();
		Scanner sc = new Scanner(System.in);
		int n;

		n = sc.nextInt();
		while(n != 0) {
			list.clear();
			for(int i = 0; i < n; i++) {
				int nn = sc.nextInt();
				list.add(nn);
			}
			list.add(Integer.MAX_VALUE);
			
			Collections.sort(list);
			int count = 1;
			int color = 0;
			boolean flag = false;
			
			for(int i = 0; i <= n / 2; i++) {
				while(list.get(i) == list.get(i + 1)) {
					count++;
					i++;
				}
				if (count > n / 2) {
					color = list.get(i);
					flag = true;
					break;
				}
				count = 1;
			}
			
			if (flag) {
				System.out.println(color);
			} else {
				System.out.println("NO COLOR");
			}
			
			n = sc.nextInt();
		}
	}
}
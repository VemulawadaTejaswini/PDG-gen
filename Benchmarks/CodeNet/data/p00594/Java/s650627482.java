import java.util.*;
public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		List<Integer> list;
		int n;
		
		n = sc.nextInt();
		while(n != 0) {
			list = new ArrayList<Integer>(1000001);
			for(int i = 0; i < n; i++) {
				list.add(sc.nextInt());
			}
			list.sort(null);
			list.add(Integer.MAX_VALUE);
			
			int count = 1;
			int color = Integer.MAX_VALUE;
			
			for(int i = 0; i <= n / 2; i++) {
				while (list.get(i) == list.get(i + 1)) {
					count++;
					i++;
				}
				if (count > n / 2) {
					color = list.get(i);
					break;
				}
				count = 1;
			}
			
			if (color == Integer.MAX_VALUE) {
				System.out.println("NO COLOR"); 
			} else {
				System.out.println(color);
			}
			
			n = sc.nextInt();
		}
	}
}
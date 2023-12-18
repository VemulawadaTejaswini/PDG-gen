import java.util.*;
public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int[] list;
		int n;
		
		n = sc.nextInt();
		while(n != 0) {
			//System.gc();
			list = new int[n + 1];
			for(int i = 0; i < n; i++) {
				list[i] = sc.nextInt();
			}
			list[n] = Integer.MAX_VALUE;
			Arrays.sort(list);
			
			int count = 1;
			int color = Integer.MAX_VALUE;
			
			for(int i = 0; i <= n / 2; i++) {
				while (list[i] == list[i + 1]) {
					count++;
					i++;
				}
				if (count > n / 2) {
					color = list[i];
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
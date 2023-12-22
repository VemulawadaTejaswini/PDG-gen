import java.util.*;
public class Main {

	public static void main(String[] args) {
		int count[];
		int ans[];
		Scanner scanner = new Scanner(System.in);
		
		count = new int[100];
		ans = new int[100];
		
		int n = scanner.nextInt();
		int m = scanner.nextInt();
		
		while(n != 0 || m != 0) {
			for(int i = 0; i < m; i++) {
				count[i] = 0;
				ans[i] = i + 1;
			}
			
			for(int i = 0; i < n; i++) {
				for(int j = 0; j < m; j++) {
					int wish = scanner.nextInt();
					if(wish == 1) {
						count[j]++;
					}
				}
			}
			
			for(int i = 1; i < m; i++) {
				int j = i;
				while ((j > 0) && (count[j - 1] < count[j])) {
					int a = count[j - 1];
					count[j - 1] = count[j];
					count[j] = a;
						
					a = ans[j - 1];
					ans[j - 1] = ans[j];
					ans[j] = a;
						
					j--;
				}
			}
			
			System.out.print(ans[0]);
			for(int i = 1; i < m; i++) {
				System.out.print(" " + ans[i]);
			}
			System.out.println();
			
			n = scanner.nextInt();
			m = scanner.nextInt();
		}
	}
}
import java.util.*;

public class Main {
	public static void main(String[] args) {
				
		Scanner sc = new Scanner(System.in);
		LinkedList<Integer> ll = new LinkedList<>();
		
		int n = 999;
		int x = 999;
		int cnt = 0;
		while(n != 0 || x != 0) {
			n = sc.nextInt();
			x = sc.nextInt();
			int ans = 0;
			if(n == 0 && x == 0) {
				break;
			} else {
				cnt++;
				for(int i = 1; i <= n; i++) {
					for(int j = 1; j < i; j++) {
						for(int k = 1; k < j; k++) {
							if(i + k + j == x) {
								ans++;
							}
						}
					}
				}
				ll.add(ans);
			}
		}
		
		for(int i = 0; i < cnt; i++) {
			System.out.println(ll.get(i));
		}
	}
}
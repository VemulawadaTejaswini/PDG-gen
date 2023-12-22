import java.util.*;
public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int m = sc.nextInt();
		String s = sc.next();
		boolean flag = true;
		Deque<Integer> deq = new ArrayDeque<Integer>();
		int now = n;
		A:while(now > 0){
			if(now-m>=0) {
				for (int i = m; i > 0 ; i--) {
					if(s.charAt(now-i) == '0') {
						now -= i;
						deq.addFirst(i);
						break;
					}else if(i == 1) {
						flag = false;
						break A;
					}
				}
			}else {
				deq.addFirst(now);
				break;
			}
		}
		if(flag) {
			while(!deq.isEmpty()) {
				System.out.printf("%d ", deq.pollFirst());
			}
		}else System.out.println(-1);
	}
}

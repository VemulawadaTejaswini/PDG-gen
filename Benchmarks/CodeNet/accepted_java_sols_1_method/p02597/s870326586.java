import java.util.ArrayList;
import java.util.Scanner;

public class Main {
	public static void main(String args[]) {
		Scanner stdIn = new Scanner(System.in);
		int N = stdIn.nextInt();
		String c = stdIn.next();
		ArrayList<Integer> C = new ArrayList<Integer>();
		for(int i = 0; i < N; i ++) {
			if(c.substring(i, i + 1).equals("R")) {
				C.add(0);
			}else {
				C.add(1);
			}
		}
		
		int ans = 0;
		int left = 0;
		int right = N - 1;
		while(true) {
			while(C.get(left) == 0) {
				left ++;
				if(N <= left) {
					break;
				}
			}
			while(C.get(right) == 1) {
				right --;
				if(right < 0) {
					break;
				}
			}
			if(right < left) {
				break;
			}else {
				ans ++;
				C.set(left, 0);
				C.set(right, 1);
			}
		}
		System.out.println(ans);
	}
}
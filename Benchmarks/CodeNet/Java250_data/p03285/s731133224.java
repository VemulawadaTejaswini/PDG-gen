import java.lang.reflect.Array;
import java.util.*;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		// 入力
		int N = sc.nextInt();
		boolean ans = false;
		
		if (N % 4 == 0) {
			ans = true;
		}
		if (N % 7 == 0) {
			ans = true;
		}
		if (ans) {
			System.out.println("Yes");
			return;
		}
		int[] four = new int[N];
		for (int i = 0; i < N; i++) {
			if (4 * i > N) {
				break;
			}
			four[i] = 4 * i;
		}
		int[] seven = new int[N];
		for (int i = 0; i < N; i++) {
			if (7 * i > N) {
				break;
			}
			seven[i] = 7 * i;
		}
		for (int i = 0; i < N; i++) {
			for (int j = 0; j < N; j++) {
				if (four[i]+seven[j]==N) {
					ans = true;
					break;
				}
			}
			if(ans){
				break;
			}
		}
		if(ans) {
			System.out.println("Yes");						
		} else {
			System.out.println("No");						
		}
	}	
}

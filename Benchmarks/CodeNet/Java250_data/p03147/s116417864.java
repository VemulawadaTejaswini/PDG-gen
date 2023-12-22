import java.util.Scanner;

/**
 * 
 * @author morisin
 * 
 */
public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		// 花の数
		int N = sc.nextInt();

		// 一つ手前の花の高さ
		int prev = 0;
		
		// 水やり回数
		int cnt = 0;
		
		// 花の高さの入力
		for (int i = 0; i < N; i++) {
			int h = sc.nextInt();
			if (h < prev)
				cnt += prev - h;
			prev = h;
		}
		cnt+=prev;
		
		System.out.println(cnt);
	}

}

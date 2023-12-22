import java.util.*;

public class Main {
	public static void main (String[] args) {
		Scanner sc = new Scanner(System.in);
		int h = sc.nextInt();
		int w = sc.nextInt();
		int n = sc.nextInt();
		int r = sc.nextInt();
		int c = sc.nextInt();
		char[] sArr = sc.next().toCharArray();
		char[] tArr = sc.next().toCharArray();
		int left = 1;
		int right = w;
		int up = 1;
		int down = h;
		boolean alive = true;
		for (int i = n - 1; i >= 0; i--) {
			switch (tArr[i]) {
				case 'L':
				right = Math.min(w, right + 1);
				break;
				case 'R':
				left = Math.max(1, left - 1);
				break;
				case 'U':
				down = Math.min(h, down + 1);
				break;
				case 'D':
				up = Math.max(1, up - 1);
				break;
			}
			switch (sArr[i]) {
				case 'L':
				left++;
				break;
				case 'R':
				right--;
				break;
				case 'U':
				up++;
				break;
				case 'D':
				down--;
				break;
			}
			if (left > right || up > down) {
				alive = false;
				break;
			}
		}
		if (alive && r >= up && r <= down && c >= left && c <= right) {
			System.out.println("YES");
		} else {
			System.out.println("NO");
		}
	}
}

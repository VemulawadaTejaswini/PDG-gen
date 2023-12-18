import java.util.ArrayDeque;
import java.util.Deque;
import java.util.Scanner;

public class Main{
	static int H, W;
	static final int MAX = 1401;
	static int buffer[][] = new int[MAX][MAX];
	static int T[][] = new int[MAX][MAX];
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		H = scan.nextInt();
		W = scan.nextInt();
		//int[][]buffer = new int[H][W];
		for(int i = 0; i < H; i++) {
			for(int j = 0; j < W; j++) {
				buffer[i][j] = scan.nextInt();
			}
		}
		scan.close();
		System.out.println(getLargestRectangle());
	}
	static int getLargestRectangle(int size, int[] a) {
		Deque<int[]> stack = new ArrayDeque<int[]>();
		int maxv = 0;
		a[size] = 0;
		for(int i = 0; i <= size; i++) {
			int[]rect = {a[i], i};
			if(stack.isEmpty()) {
				stack.push(rect);
			}else {
				if(stack.peek()[0] < rect[0]) {
					stack.push(rect);
				}else if(stack.peek()[0] > rect[0]) {
					int target = i;
					while(!stack.isEmpty() && stack.peek()[0] >= rect[0]) {
						int[]p = stack.pop();
						int area = p[0] * (i - p[1]);
						maxv = Math.max(maxv, area);
						target = p[1];
					}
					rect[1] = target;
					stack.push(rect);
				}
			}
		}
		return maxv;
	}
	static int getLargestRectangle() {
		for(int j = 0; j < W; j++) {
			for(int i = 0; i < H; i++) {
				if(buffer[i][j] == 1) {
					T[i][j] = 0;
				}else {
					if(i > 0) {
						T[i][j] = T[i - 1][j] + 1;
					}else {
						T[i][j] = 1;
					}
				}
			}
		}
		int maxv = 0;
		for(int i = 0; i < H; i++) {
			maxv = Math.max(maxv, getLargestRectangle(W, T[i]));
		}
		return maxv;
	}
}

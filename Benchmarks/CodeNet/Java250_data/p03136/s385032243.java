import java.util.*;
public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();
		long length[] = new long[num];
		long max = 0;
		long sum = 0;
		for(int i = 0; i < num; i ++) {
			length[i] = sc.nextInt();
			max = Math.max(max, length[i]);
			sum += length[i];
		}
		sum -= max;
		boolean canDraw = max < sum;
		System.out.println(canDraw ? "Yes" : "No");
	}
}
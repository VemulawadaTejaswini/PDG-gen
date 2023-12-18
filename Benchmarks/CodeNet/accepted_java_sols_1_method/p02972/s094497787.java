import java.util.*;
public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();
		boolean odd[] = new boolean[num];
		for(int i = 0; i < num; i ++) {
			odd[i] = sc.nextLong() == 1;
		}
		boolean ans[] = new boolean[num];
		for(int i = num; i >= 1; i --) {
			ans[i - 1] = odd[i - 1];
			for(int j = 2; i * j <= num; j ++) {
				ans[i - 1] ^= ans[i * j - 1];
			}
		}
		int count = 0;
		for(int i = 0; i < num; i ++) {
			if(ans[i]) { count ++; }
		}
		System.out.println(count);
		for(int i = 0; i < num; i ++) {
			if(ans[i]) { System.out.print((i + 1)+" "); }
		}
		System.out.println();
	}
}
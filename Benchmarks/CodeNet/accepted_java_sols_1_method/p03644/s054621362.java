import java.util.*;
public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int[] num = new int[N + 1];
		for(int i = 1;i <= N;i ++) {
			num[i] = 0;
			int x = i;
			for(int k = 0;;k ++) {
				if(x % 2 != 0)break;
				x = x / 2;
				num[i] ++;
			}
		}
		int maxidx = 1,max = num[1];
		for(int i = 2;i < N + 1;i ++) {
			if(max < num[i]) {
				maxidx = i;
				max = num[i];
			}
		}
		System.out.println(maxidx);
	}
}
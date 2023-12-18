import java.util.*;
public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();
		long task[][] = new long[num][2];
		for(int i = 0; i < num; i ++) {
			task[i][0] = sc.nextLong();
			task[i][1] = sc.nextLong();
		}
		Arrays.sort(task, (a, b) -> Long.compare(a[1], b[1]));
		long crt = 0;
		for(int i = 0; i < num; i ++) {
			crt += task[i][0];
			if(crt > task[i][1]) {
				System.out.println("No"); return;
			}
		}
		System.out.println("Yes");
	}
}
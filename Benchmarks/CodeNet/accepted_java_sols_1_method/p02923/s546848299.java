import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		int N = scn.nextInt();
		int ans = 0;
		int now = 0;
		int bef = -1;
		for(int i = 0;i < N;i++) {
			int a = scn.nextInt();
			if(bef >= a) {
				now++;
			}else {
				ans = Math.max(ans, now);
				now = 0;
			}
			bef = a;
		}
		ans = Math.max(ans, now);
		System.out.println(ans);
	}

}
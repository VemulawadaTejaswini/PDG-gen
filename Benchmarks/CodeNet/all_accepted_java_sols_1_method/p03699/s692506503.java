import java.util.Arrays;
import java.util.Scanner;

public class Main{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		boolean[] canmake = new boolean[10101]; // kawaii!
		Arrays.fill(canmake, false);
		for(int i = 0; i < N; i++) {
			int s = sc.nextInt();
			for(int j = 10100; j >= 0; j--) {
				if(canmake[j] && j + s < 10101) canmake[j + s] = true;
			}
			canmake[s] = true;
		}
		int ans;
		for(ans = 10000; ans > 0; ans--) if(canmake[ans] && (ans % 10 != 0)) break;
		System.out.println(ans);
	}
}
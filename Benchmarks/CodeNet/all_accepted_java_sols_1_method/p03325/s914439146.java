import java.util.Scanner;

public class Main {
	public static void main(String args[]) {
		Scanner scn = new Scanner(System.in);
		int N = scn.nextInt();
		int ans = 0,buf = 0 ;
		for(int i = 0;i<N;i++) {
			buf = scn.nextInt();
			while(buf % 2 == 0) {
				ans++;
				buf/=2;
			}
		}
		scn.close();
		System.out.println(ans);
	}
}

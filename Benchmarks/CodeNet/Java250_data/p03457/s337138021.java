import java.util.Scanner;

public class Main {


	public static boolean hantei(int N, int t, int T, int x, int X, int y, int Y) {
		boolean plan = false;
		int rt = t - T;
		int dist = x + y - X - Y;
		if(rt >= dist && ((rt-dist)%2 == 0)) {
			plan = true;
		}
		return plan;
	}


	public static void main(String[] args) {
		int N,t,x,y;
		int T = 0;
		int X = 0;
		int Y = 0;
		boolean plan;
		Scanner sc = new Scanner(System.in);
		N = sc.nextInt();

		for(int i = 0; i < N; i++) {
			t = sc.nextInt();
			x = sc.nextInt();
			y = sc.nextInt();
			plan = hantei(N, t, T, x, X, y, Y);
			if(!plan){
				System.out.println("No");
				System.exit(0);
			}
			T = t;
			X = x;
			Y = y;
		}
		System.out.println("Yes");
		sc.close();
	}
}

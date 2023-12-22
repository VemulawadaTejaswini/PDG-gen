import java.util.*;

public class Main {
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int nowx = 0, nowy = 0, nowt = 0;
		for (int i = 0; i < N; i++) {
			int t = sc.nextInt();
			int x = sc.nextInt();
			int y = sc.nextInt();
			int dist = Math.abs(x - nowx) + Math.abs(y - nowy);
			if (((t - nowt) % 2 != dist % 2) || t - nowt < dist) {
				System.out.println("No");
				return;
			}
			nowx = x;
			nowy = y;
			nowt = t;
		}
		System.out.println("Yes");
	}
}
import java.util.Scanner;
public class Main{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();		
		int t = 0, x = 0, y = 0;
		boolean flg = true;
		for (int i = 0; i < N; i++) {
			int nowT = sc.nextInt();
			int nowX = sc.nextInt();
			int nowY = sc.nextInt();
			int time = nowT - t;
			int dist = Math.abs(x - nowX) + Math.abs(y - nowY);
			if (time < dist || time%2 != dist%2) {
				flg = false;
				break;
			}
			t = nowT;
			x = nowX;
			y = nowY;
		}
		System.out.println(flg ? "Yes" : "No");
	}
}
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int m = sc.nextInt();
		int[] ballInfo = new int[n +1];
		boolean[] redBallInfo = new boolean[n +1];
		redBallInfo[1] = true;
		for(int i =1;i <=n;i++) {
			ballInfo[i] = 1;
		}
		for(int i =0;i < m;i++) {
			int x = sc.nextInt();
			int y = sc.nextInt();
			if(redBallInfo[x]) {
				if(ballInfo[x] ==1) {
					redBallInfo[x] = false;
				}
				redBallInfo[y] = true;
			}
			ballInfo[x]--;
			ballInfo[y]++;
		}
		int answer = 0;
		for(boolean redBall :redBallInfo) {
			if(redBall) {
				answer++;
			}
		}

		System.out.println(answer);
	}
}
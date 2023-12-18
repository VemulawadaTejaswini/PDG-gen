import java.util.Arrays;
import java.util.Scanner;

/* Super_Metropolis */
public class Main {	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int w = sc.nextInt(); // 縦の道の本数
		int h = sc.nextInt(); // 横の道の本数
		int n = sc.nextInt(); // 目的地の数
		int x, y;
		
		//PROCESS
		int myX = 1, myY = 1; // 現在地情報を初期化
		int dx = 0, dy = 0; // 座標の距離を格納
		int[] dif = new int[2]; // 座標の差を格納
		dif[0] = 0;
		dif[1] = 1;
		int cnt = 0; // 通った本数を保持する	
		for(int i=0; i<n ;i++) {
			x = sc.nextInt();
			if(x < 1 && x > w) System.exit(-1);
			y = sc.nextInt();
			if(y < 1 && y > h) System.exit(-1);
			dx = x - myX; // スポットのx座標までの距離
			dy = y - myY; // スポットのy座標までの距離
			dif[0] = Math.abs(dx); // xの差を格納
			dif[1] = Math.abs(dy); // yの差を格納
			cnt += dif[0] + dif[1]; // 斜めの道を考えない通り方
			//System.out.printf("dif[0] = %d dif[1] = %d cnt = %d\n", dif[0], dif[1], cnt);
			if((dx > 0 && dy > 0) || (dx < 0 && dy < 0)) { // 斜めの道があるときの処理
				Arrays.sort(dif); // 小さい方の数を先頭にソート
				cnt -= dif[0]; // 小さい方を排除
				//System.out.printf("ifの中身 cnt = %d\n", cnt);
			}
			myX = x; // 現在地の更新
			myY = y;
		}
		//OUTPUT
		System.out.println(cnt);
	}
}
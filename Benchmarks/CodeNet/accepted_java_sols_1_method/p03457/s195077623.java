import java.util.*;

public class Main {
    public static void main(String[] args) throws Exception {

        int result = 0;
        
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int t[] = new int[110000];
        int x[] = new int[110000];
        int y[] = new int[110000];
        
        // 初期位置
        t[0] = 0; x[0] = 0; y[0] = 0;

        // 入力値を代入
        for (int i = 0;i < n; i++){
            t[i+1] = sc.nextInt();
            x[i+1] = sc.nextInt();
            y[i+1] = sc.nextInt();
        }
        
        boolean can = true;
        // 時刻tに点(x,y)に到達できるか探索
		for (int i = 0; i < n; i++) {
		    // 入力値の時刻tから現在の経過時間を引き、制限時間を算出
		    int dt = t[i+1] - t[i];
		    
		    // 入力値の点(x,y)から現在の点(x,y)の値を引いた値の絶対値を足し、移動距離を算出
		    int dist = Math.abs(x[i+1] - x[i]) + Math.abs(y[i+1] - y[i]);
		    
		    // 制限時間より移動距離のほうが大きい場合失敗判定
		    if (dt < dist) can = false;
		    
		    // 制限時間と移動距離が共に偶数または奇数でない場合失敗判定
		    if (dist % 2 != dt % 2) can = false;
		}
        
        if (can) {
            System.out.println("Yes");
        } else {
            System.out.println("No");
        }
        sc.close();
    }
}
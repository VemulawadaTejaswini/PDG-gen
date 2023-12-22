
import java.util.Map.Entry;
import java.util.*;
import java.math.*;
import org.w3c.dom.css.Counter;
  
public class Main{
    public static void main(String[] args){
        Scanner s = new Scanner(System.in);
        //モンスターの体力
        int H = Integer.valueOf(s.next());
        //魔法の種類
        int N = Integer.valueOf(s.next());
        //体力減少
        int[] HPdown = new int[N+1];
        //魔法減少
        int[] MPcost = new int[N+1];
        //未到達の値
        int noRoot = 100000001;
		for(int i = 0; i < N; i++) {
			HPdown[i] = Integer.valueOf(s.next());
			MPcost[i] = Integer.valueOf(s.next());
        }
    
		//動的
        long[] dp = new long[20000];
        //整頓
        Arrays.fill(dp, noRoot);
        //初期値(0)設定
		dp[0] = 0;
        //魔法の種類だけくり返す
		for(int i = 0; i < N; i++) {
            //i=0
            //十分な数繰り返す
			for(int j = 0; j < 10000; j++) {
                    //あるHP値への到達方法に対して
                    //既存の方法と、新しい方法、より低コストな方を選択
                    dp[j+HPdown[i]] =
                    Long.min(dp[j+HPdown[i]], dp[j] + MPcost[i]);
			}
        }
        //目標値以上の到達方法のなかから、最小のものを選択
		for(int i = 10001; i >= 0; i--) {
			dp[i] = Long.min(dp[i], dp[i+1]);
		}
		System.out.println(dp[H]);
    }
}
    


    
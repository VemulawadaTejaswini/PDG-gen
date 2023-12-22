import java.util.*;
import java.lang.Math;
public class Main {
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		// 整数の入力
		int N = sc.nextInt();

    int[] W = new int[N];
    int all = 0;

    for(int i = 0; i < N; i++){
      W[i] = sc.nextInt();
      all += W[i];
    }

    int S1 = 0;
    int S2 = all;
    int hall = all/2;
    for(int fh = 0; fh < N; fh++){
      S1 += W[fh];
      if(S1 >= hall){
        break;
      }
    }
		S2 -= S1;
		int ans = Math.abs(S2 - S1);

		S1 = 0;
		S2 = all;
		for(int sh = N-1; sh >= 0; sh--){
      S1 += W[sh];
      if(S1 >= hall){
        break;
      }
    }
		S2 -= S1;
		if(ans > Math.abs(S2 - S1)){
			ans = Math.abs(S2 - S1);
		}

		System.out.println(ans);
	}
}
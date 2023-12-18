import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Main {

	public static final int BIG_NUM = 2000000000;
	public static final int MOD = 1000000007;
	public static final long HUGE_NUM = 99999999999999999L;
	public static final double EPS = 0.000000001;

	public static final int SIZE = 21;

	@SuppressWarnings("unchecked")
	public static void main(String[] args) {

		//BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		int POW[] = new int[SIZE];
		POW[0] = 1;
		for(int i = 1; i < SIZE; i++){

			POW[i] = POW[i-1]*2;
		}

		Scanner scanner = new Scanner(System.in);

		int N = scanner.nextInt();
		int M = scanner.nextInt();

		//種類の個数を記録
		int table[] = new int[M];
		for(int i = 0; i < table.length; i++){

			table[i] = 0;
		}

		//移動するぬいぐるみの個数を求めるための累積和テーブル
		int ruisekiwa[][] = new int[M][N];
		for(int row = 0; row < M; row++){
			for(int col = 0; col < N; col++){

				ruisekiwa[row][col] = 0;
			}
		}


		int tmp;

		for(int i = 0; i < N; i++){

			tmp = scanner.nextInt();
			tmp--;
			table[tmp]++;
			ruisekiwa[tmp][i] += 1;
		}

		for(int row = 0; row < M; row++){
			for(int col = 1; col < N; col++){

				ruisekiwa[row][col] += ruisekiwa[row][col-1];
			}
		}

		int dp[] = new int[POW[M]];

		dp[0] = 0;
		for(int state = 1; state < POW[M]; state++){

			dp[state] = BIG_NUM;
		}

		int left,right;
		int tmp_sum,next_state,add,loc;

		for(int state = 0; state < POW[M]-1; state++){

			tmp_sum = 0;

			//配置済のぬいぐるみの個数を求める
			for(int loop = 0; loop < M; loop++){
				if((state & POW[loop]) != 0){
					tmp_sum += table[loop];
				}
			}

			left = tmp_sum;

			for(int loop = 0; loop < M; loop++){
				if((state & POW[loop]) == 0){ //次に置くぬいぐるみ

					right = tmp_sum+table[loop]-1;

					//範囲より左
					if(left == 0){

						add = 0;
					}else{

						add = ruisekiwa[loop][left-1];
					}
					//範囲より右
					add += (ruisekiwa[loop][N-1]-ruisekiwa[loop][right]);

					next_state = state+POW[loop];
					dp[next_state] = Math.min(dp[next_state],dp[state]+add);
				}
			}
		}

		System.out.println(dp[POW[M]-1]);
    }
}


class UTIL{

    //String→intへ変換
    public static int getNUM(String tmp_str){

        return Integer.parseInt(tmp_str);
    }

    //文字が半角数字か判定する関数
    public static boolean isNumber(String tmp_str){

        if(tmp_str == null || tmp_str.length() == 0){

            return false;
        }

        Pattern pattern = Pattern.compile("\\A[0-9]+\\z");
        Matcher matcher = pattern.matcher(tmp_str);
        return matcher.matches();
    }
}

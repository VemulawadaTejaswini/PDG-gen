import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Main {

	public static final int BIG_NUM = 2000000000;
	public static final int MOD = 1000000007;
	public static final long HUGE_NUM = 99999999999999999L;
	public static final double EPS = 0.000000001;

	@SuppressWarnings("unchecked")
	public static void main(String[] args) {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		//Scanner scanner = new Scanner(System.in);

		try {

			int POW[] = new int[4];
			POW[0] = 1;
			for(int i = 1; i < 4; i++){

				POW[i] = POW[i-1]*2;
			}

			final int M = 10007;

			int dp[][] = new int[2][8];
			int CURRENT = 0,NEXT = 1;
			for(int state = 0; state < POW[3]-1;state++){

				dp[CURRENT][state] = 0;
			}

			dp[CURRENT][POW[3]-1] = 1;

			int length = Integer.parseInt(br.readLine());
			char table[] = br.readLine().toCharArray();

			for(int i = 0; i < length; i++){
				for(int state = 0; state < POW[3]; state++){

					dp[NEXT][state] = 0;
				}

				int must_attend = calc(table[i]);

				for(int next_state = 1; next_state < POW[3]; next_state++){

					if(i==0 && ((next_state&POW[calc('J')]) == 0))continue; //最初はJが鍵を持っている
					if((next_state & POW[must_attend]) == 0)continue; //責任者が出席しないならSKIP

					for(int state = 1; state < POW[3]; state++){

						if((state&next_state) == 0 || dp[CURRENT][state] == 0)continue; //2日間の共通出席者が不在かdpが0ならSKIP

						dp[NEXT][next_state] += dp[CURRENT][state];
						dp[NEXT][next_state] %= M;
					}
				}
				CURRENT = 1-CURRENT;
				NEXT = 1-NEXT;
			}

			int ans = 0;
			for(int state = 0; state < POW[3]; state++){

				ans += dp[CURRENT][state];
				ans %= M;
			}

			System.out.println(ans);

		} catch (IOException e) {
			// TODO 自動生成された catch ブロック
			e.printStackTrace();
		}

    }

	public static int calc(char ch){

		switch(ch){
		case 'J':
			return 0;
		case 'O':
			return 1;
		case 'I':
			return 2;
		}
		return -1; //must not reach here
	}
}

class UTIL{

	//最大公約数
	public static long gcd(long x,long y){

		x = Math.abs(x);
		y = Math.abs(y);

		if(x < y){

			long tmp = y;
			y = x;
			x = tmp;
		}

		if(y == 0){

			return x;
		}else{

			return gcd(y,x%y);
		}
	}

	//最小公倍数
	public static long lcm(long x,long y){

		return (x*y)/gcd(x,y);
	}

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

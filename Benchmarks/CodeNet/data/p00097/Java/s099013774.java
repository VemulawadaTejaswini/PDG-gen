import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Main {

	public static final int BIG_NUM = 2000000000;
	public static final int MOD = 1000000007;
	public static final long HUGE_NUM = 99999999999999999L;
	public static final double EPS = 0.000000001;



	@SuppressWarnings("unchecked")
	public static void main(String[] args) {

		//BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		Scanner scanner = new Scanner(System.in);

		long dp[][][] = new long[10][101][1001];

		for(int i = 0; i < 10; i++){
			for(int k = 0; k <= 100; k++){
				for(int p = 0; p <= 1000; p++){
					dp[i][k][p] = 0;
				}
			}
		}

		//最初の数字
		for(int first = 0; first <= 100; first++){

			dp[0][first][first] = 1;
		}

		for(int index = 1; index <= 9; index++){
			for(int pre_num = 0; pre_num <= 100; pre_num++){
				for(int pre_sum = 0; pre_sum <= 1000; pre_sum++){
					if(dp[index-1][pre_num][pre_sum] == 0)continue;

					for(int next_num = pre_num+1; next_num <= 100 && pre_sum+next_num <= 1000; next_num++){

						dp[index][next_num][pre_sum+next_num] += dp[index-1][pre_num][pre_sum];
					}
				}
			}
		}

		StringBuilder ans = new StringBuilder();

		while(true){

			int N = scanner.nextInt();
			int S = scanner.nextInt();

			if(N == 0 && S == 0)break;

			long tmp = 0;
			for(int i = 0; i <= 100; i++){

				tmp += dp[N-1][i][S];
			}
			ans.append(Long.toString(tmp)).append("\n");
		}

		System.out.print(ans.toString());
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

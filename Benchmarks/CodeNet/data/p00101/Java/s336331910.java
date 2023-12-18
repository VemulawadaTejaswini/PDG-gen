import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Main {

	public static final int BIG_NUM = 2000000000;
	public static final int MOD = 1000000007;
	public static final long HUGE_NUM = 99999999999999999L;
	public static final double EPS = 0.000000001;

	public static final int SIZE = 1005;
	public static long dp[][];

	@SuppressWarnings("unchecked")
	public static void main(String[] args) {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		Scanner scanner = new Scanner(System.in);

		char from[] = "Hoshino".toCharArray();
		char to[] = "Hoshina".toCharArray();

		int P_length = 7;
		int T_length = 0;

		try {

			int num_case = Integer.parseInt(br.readLine());

			for(int loop = 0; loop < num_case; loop++){

					String input_str = br.readLine();
					T_length = input_str.length();

					char T[] = input_str.toCharArray();

					boolean FLG = true;

					for(int i = 0; i < T_length; i++){

						if(i+P_length > T_length)break;

						FLG = true;
						for(int k = 0; k < P_length; k++){

							if(from[k] != T[i+k]){

								FLG = false;
								break;
							}
						}
						if(FLG){
							for(int k = 0; k < P_length; k++){

								T[i+k] = to[k];
							}
						}
					}

					System.out.println(T);
			}

		} catch (IOException e) {
			// TODO 自動生成された catch ブロック
			e.printStackTrace();
		}

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

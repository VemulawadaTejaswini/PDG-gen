import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;
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

		int SIZE = 55;

		Set<String> SET = new HashSet<String>();
		StringBuilder ans = new StringBuilder();

		int LENGTH[] = new int[SIZE];
		char words[][] = new char[SIZE][SIZE];
		char array[] = {'a','i','u','e','o'};

		while(true){

			int N = scanner.nextInt();
			if(N == 0)break;

			int maximum = 0;

			int ans_K = BIG_NUM;

			//文字列の入力
			for(int i = 0; i < N; i++){

				String input_str = scanner.next();
				LENGTH[i] = input_str.length();
				maximum = Math.max(maximum, LENGTH[i]);

				char work[] = input_str.toCharArray();
				for(int k = 0; k < LENGTH[i]; k++){

					words[i][k] = work[k];
				}
			}

			for(int k = 1; k <= maximum; k++){

				SET.clear();
				boolean FLG = true;

				for(int i = 0; i < N; i++){

					//文字列iのコードを作る
					StringBuilder sb = new StringBuilder();
					sb.append(words[i][0]); //先頭の1文字

					int tmp_len = 1;

					//母音に続く文字
					for(int a = 1; a < LENGTH[i] && tmp_len < k; a++){

						boolean tmp_FLG = false;
						for(int b = 0; b < array.length; b++){

							if(words[i][a-1] == array[b]){

								tmp_FLG = true;
								break;
							}
						}

						if(tmp_FLG){
							sb.append(words[i][a]);
							tmp_len += 1;
						}
					}

					String add_str = sb.toString();
					if(SET.contains(add_str)){

						FLG = false;
						break;

					}else{

						SET.add(add_str);
					}
				}

				if(FLG){

					ans_K = k;
					break;
				}
			}
			if(ans_K == BIG_NUM){

				ans.append("-1\n");

			}else{

				ans.append(Integer.toString(ans_K)).append("\n");
			}
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

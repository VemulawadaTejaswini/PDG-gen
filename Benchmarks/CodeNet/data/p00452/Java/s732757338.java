import java.util.Arrays;
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

		StringBuilder ANS = new StringBuilder();

		while(true){

			int N = scanner.nextInt();
			int M = scanner.nextInt();

			if(N == 0 && M == 0)break;

			int table_1[] = new int[N]; //加算なしテーブル
			int size_2 = N+(N*(N-1))/2;
			int table_2[] = new int[size_2]; //2回の和のテーブル

			int ans = 0;

			for(int i = 0; i < N; i++){

				table_1[i] = scanner.nextInt();
				if(table_1[i] <= M){

					ans = Math.max(ans, table_1[i]);
				}
			}

			int index = 0;
			//2回の和のテーブルを作る
			for(int i = 0; i < N; i++){
				table_2[index] = 2*table_1[i];
				if(table_2[index] <= M){

					ans = Math.max(ans, table_2[index]);
				}
				index++;

				for(int k = i+1; k < N; k++){
					table_2[index] = table_1[i]+table_1[k];
					if(table_2[index] <= M){

						ans = Math.max(ans, table_2[index]);
					}
					index++;
				}
			}

			Arrays.sort(table_2);

			//3つの和
			int left,right,mid;
			for(int i = 0; i < N; i++){
				left = 0;
				right = size_2-1;
				mid = (left+right)/2;

				while(left <= right){
					if(table_1[i]+table_2[mid] <= M){

						ans = Math.max(ans, table_1[i]+table_2[mid]);
						left = mid+1;

					}else{

						right = mid-1;
					}
					mid = (left+right)/2;
				}
			}

			//4つの和
			for(int i = 0; i < size_2; i++){
				left = 0;
				right = size_2-1;
				mid = (left+right)/2;

				while(left <= right){
					if(table_2[i]+table_2[mid] <= M){

						ans = Math.max(ans, table_2[i]+table_2[mid]);
						left = mid+1;

					}else{

						right = mid-1;
					}
					mid = (left+right)/2;
				}
			}

			ANS.append(Integer.toString(ans)).append("\n");
		}
		System.out.print(ANS.toString());
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

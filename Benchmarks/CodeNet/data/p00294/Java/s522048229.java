import java.util.Arrays;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Main {

	public static final int BIG_NUM = 2000000000;
	//public static final int MOD = 1000000007;
	public static final long HUGE_NUM = 99999999999999999L;
	public static final double EPS = 0.000000001;

	@SuppressWarnings("unchecked")
	public static void main(String[] args) {

		//BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		Scanner scanner = new Scanner(System.in);

		int N = scanner.nextInt();
		int M = scanner.nextInt();
		int start = scanner.nextInt();

		final long NUM = 100;
		final long TOTAL = NUM*N; //1周のコスト

		long dist[] = new long[N]; //時計回りの距離
		long rev_dist[] = new long[N]; //半時計回りの距離
		int table[] = new int[M+1]; //買い物をする駅

		int tmp;

		table[0] = start;
		dist[start] = 0;
		rev_dist[start] = 0;

		for(int i = 1; i <= M; i++){

			tmp = scanner.nextInt();
			table[i] = tmp;

			if(tmp > start){ //時計回り

				dist[tmp] = (tmp-start)*NUM;
				rev_dist[tmp] = TOTAL-dist[tmp];

			}else{ //tmp < start 半時計周り

				rev_dist[tmp] = (start-tmp)*NUM;
				dist[tmp] = TOTAL-rev_dist[tmp];
			}
		}
		Arrays.sort(table);

		int start_loc = -1;
		for(int i = 0; i <= M; i++){
			if(table[i] == start){

				start_loc = i;
				break;
			}
		}

		int MOD = M+1;

		long ans = HUGE_NUM;

		for(int i = 0; i <= M; i++){
			//0駅以上時計回りに進んでから折り返す、または0駅以上半時計周りに進んでから折り返す()
			ans = Math.min(ans, Math.min(2*dist[table[(start_loc+i)%MOD]]+rev_dist[table[(start_loc+i+1)%MOD]],
					dist[table[(start_loc+i)%MOD]]+2*rev_dist[table[(start_loc+i+1)%MOD]]));
		}
		System.out.println(ans);
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

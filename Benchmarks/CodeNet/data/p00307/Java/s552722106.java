import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Main {

	public static final int BIG_NUM = 2000000000;
	public static final int MOD = 1000000007;
	public static final long HUGE_NUM = 99999999999999999L;
	public static final double EPS = 0.000000001;

	public static int SIZE = 16;

	@SuppressWarnings("unchecked")
	public static void main(String[] args) {

		//BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		Scanner scanner = new Scanner(System.in);

		int POW[] = new int[SIZE];
		POW[0] = 1;
		for(int i = 1; i < SIZE; i++){

			POW[i] = POW[i-1]*2;
		}

		int M = scanner.nextInt();
		int N = scanner.nextInt();

		//本の情報
		Info info[] = new Info[M+1];
		for(int i = 0; i <= M; i++){

			info[i] = new Info();
		}
		info[0].set(0, 0);

		//棚
		Info shelf[] = new Info[N];
		for(int i = 0; i < N; i++){

			shelf[i] = new Info();
		}

		for(int i = 1; i <= M; i++){

			info[i].set(scanner.nextInt(), scanner.nextInt());
			info[i].weight += info[i-1].weight;
			info[i].thick += info[i-1].thick;
		}

		for(int i = 0; i < N; i++){

			shelf[i].set(scanner.nextInt(), scanner.nextInt());
		}

		int dp[] = new int[POW[N]];
		for(int state = 0; state < POW[N]; state++){

			dp[state] = 0; //dp[集合] = 最大冊数
		}

		boolean FLG = false;

		for(int state = 0; state < POW[N]; state++){

			int next_start = dp[state]+1; //格納を開始する本

			for(int next_shelf = 0; next_shelf < N; next_shelf++){
				if((state & POW[next_shelf]) != 0)continue; //集合に含まれているならSKIP

				int next_state = state+POW[next_shelf];

				if(info[next_start].weight-info[next_start-1].weight > shelf[next_shelf].weight ||
						info[next_start].thick-info[next_start-1].thick > shelf[next_shelf].thick){ //1冊も入らない場合

					dp[next_state] = Math.max(dp[next_state],dp[state]);

				}else{

					int left = next_start,right = M,mid = (left+right)/2;
					int tail = next_start;

					while(left <= right){

						if(info[mid].weight-info[next_start-1].weight <= shelf[next_shelf].weight &&
								info[mid].thick-info[next_start-1].thick <= shelf[next_shelf].thick){

							tail = mid;
							left = mid+1;

						}else{

							right = mid-1;
						}
						mid = (left+right)/2;
					}
					if(tail == M){

						System.out.println(M);
						FLG = true;
						break;
					}

					dp[next_state] = Math.max(dp[next_state],tail);
				}
			}
			if(FLG){

				break;
			}
		}

		if(!FLG){

			System.out.println(dp[POW[N]-1]);
		}
    }
}

class Info{

	public long weight;
	public long thick;

	public void set(int arg_weight,int arg_thick){
		weight = arg_weight;
		thick = arg_thick;
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

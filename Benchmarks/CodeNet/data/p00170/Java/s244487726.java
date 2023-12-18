import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Main {

	public static final int BIG_NUM = 2000000000;
	public static final int MOD = 1000000007;
	public static final long HUGE_NUM = 99999999999999999L;
	public static final double EPS = 0.000000001;


	public static double value;
	public static int N;
	public static final int SIZE = 10;
	public static Info info[];
	public static int table[];
	public static boolean used[];
	public static int ANS[];

	@SuppressWarnings("unchecked")
	public static void main(String[] args) {

		//BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		Scanner scanner = new Scanner(System.in);

		info = new Info[SIZE];
		table = new int[SIZE];
		used = new boolean[SIZE];
		ANS = new int[SIZE];

		for(int i = 0; i < SIZE; i++){

			info[i] = new Info();
		}

		StringBuffer ans = new StringBuffer();

		while(true){

			N = scanner.nextInt();
			if(N == 0)break;

			double total_weight = 0;

			for(int i = 0; i < N; i++){

				info[i].set(scanner.next(), scanner.nextInt(), scanner.nextInt());
				total_weight += info[i].weight;
			}

			value = (double)HUGE_NUM;

			for(int i = 0; i < N; i++){
				if(total_weight-info[i].weight > info[i].can_stand)continue;

				table[0] = i;
				used[i] = true;
				recursive(1);
				used[i] = false;
			}

			for(int i = 0; i < N; i++){

				ans.append(info[ANS[i]].name).append("\n");
			}
		}

		System.out.print(ans.toString());
	}

	public static void recursive(int index){

		if(index == N){

			double numerator = 0,denominator = 0;
			for(int i = 1; i <= N; i++){

				numerator += (double)i*info[table[i-1]].weight;
			}
			for(int i = 0; i < N; i++){

				denominator += info[table[i]].weight;
			}

			double tmp = numerator/denominator;

			if(value > tmp){
				value = tmp;

				for(int i = 0; i < N; i++){

					ANS[i] = table[i];
				}
			}

			return;
		}

		//残っている人の体重の和
		double rest_weight = 0;
		for(int i = 0; i < N; i++){
			if(used[i])continue;

			rest_weight += info[i].weight;
		}

		for(int i = 0; i < N; i++){
			if(used[i])continue;
			if(rest_weight-info[i].weight > info[i].can_stand)continue;

			table[index] = i;
			used[i] = true;
			recursive(index+1);
			used[i] = false;
		}
	}
}

class Info{

	public String name;
	public int weight;
	public int can_stand;

	void set(String arg_name,int arg_weight,int arg_can_stand){
		name = arg_name;
		weight = arg_weight;
		can_stand = arg_can_stand;
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

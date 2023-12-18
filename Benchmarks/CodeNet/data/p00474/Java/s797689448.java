import java.util.PriorityQueue;
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

		int N = scanner.nextInt();
		int L = scanner.nextInt();

		long table[] = new long[N];
		for(int i = 0; i < N; i++){

			table[i] = scanner.nextLong();
		}

		PriorityQueue<Info> Q = new PriorityQueue<Info>();

		if(table[0] > table[1]){

			Q.add(new Info(0,L-table[0]));
		}
		for(int i = 1; i < N-1; i++){
			if(table[i] > table[i-1] && table[i] > table[i+1]){

				Q.add(new Info(i,L-table[i]));
			}
		}
		if(table[N-1] > table[N-2]){

			Q.add(new Info(N-1,L-table[N-1]));
		}

		long current = 0;

		while(!Q.isEmpty()){

			current = Q.peek().time;
			table[Q.peek().id] = 0; //折れた

			if(Q.peek().id > 0 && table[Q.peek().id-1] > 0){ //左のつららがまだ折れてない場合
				if(Q.peek().id-1 == 0 || table[Q.peek().id-1] > table[Q.peek().id-2]){

					Q.add(new Info(Q.peek().id-1,current+L-table[Q.peek().id-1]));
				}
			}
			if(Q.peek().id < N-1 && table[Q.peek().id+1] > 0){ //右のつららがまだ折れてない場合
				if(Q.peek().id+1 == N-1 || table[Q.peek().id+1] > table[Q.peek().id+2]){

					Q.add(new Info(Q.peek().id+1,current+L-table[Q.peek().id+1]));
				}
			}

			Q.poll();
		}

		System.out.println(current);
	}
}

class Info implements Comparable<Info>{
	public int id;
	public long time;

	Info(){}
	Info(int arg_id,long arg_time){

		id = arg_id;
		time = arg_time;
	}
	public int compareTo(Info another){
		if(this.time < another.time)return -1;
		if(this.time > another.time)return 1;
		return 0;
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

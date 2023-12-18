import java.util.PriorityQueue;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Main {

	public static final int BIG_NUM = 2000000000;
	public static final int MOD = 1000000007;
	public static final long HUGE_NUM = 99999999999999999L;
	public static final double EPS = 0.000000001;

	public static final int OK = 0;
	public static final int NOT = 1;
	public static final int UNDEFINED = 2;
	public static final int SIZE = 255;
	public static int table[];
	public static int min_dist1[],min_dist2[];
	public static int MAX;
	public static int N;

	@SuppressWarnings("unchecked")
	public static void main(String[] args) {

		//BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		Scanner scanner = new Scanner(System.in);

		table = new int[SIZE];
		min_dist1 = new int[SIZE];
		min_dist2 = new int[SIZE];

		StringBuilder ans = new StringBuilder();

		while(true){

			MAX = scanner.nextInt();
			if(MAX == 0)break;

			N = scanner.nextInt();

			for(int i = 1; i <= N; i++){

				table[i] = scanner.nextInt();
			}

			min_dist1[0] = 0;

			for(int i = 1; i <= N; i++){

				min_dist1[i] = BIG_NUM;
			}

			PriorityQueue<Info> Q = new PriorityQueue<Info>();

			//startから行けるセルを調べる

			for(int i = 1; i <= MAX; i++){

				int loc = i;
				if(loc >= N+1){

					continue;
				}

				loc += table[i];
				if(loc >= N+1){

					continue;
				}else if(loc <= 0){

					continue;
				}

				min_dist1[loc] = 1;
				Q.add(new Info(loc,1));
			}

			while(!Q.isEmpty()){

				if(Q.peek().sum_dist > min_dist1[Q.peek().node_id]){

					Q.poll();

				}else{

					for(int k = 1; k <= MAX; k++){

						int loc = Q.peek().node_id+k;
						if(loc >= N+1)continue;

						loc += table[loc];

						if(loc >= N+1 || loc <= 0)continue;

						if(min_dist1[loc] > Q.peek().sum_dist+1){
							min_dist1[loc] = Q.peek().sum_dist+1;
							Q.add(new Info(loc,min_dist1[loc]));
						}
					}

					Q.poll();
				}
			}

			boolean FLG = true;

			for(int i = 0; i <= N; i++){
				if(min_dist1[i] == BIG_NUM)continue;

				for(int k = 0; k <= N+1; k++){

					min_dist2[k] = BIG_NUM;
				}

				min_dist2[i] = 0;
				Q.add(new Info(i,0));

				while(!Q.isEmpty()){

					if(Q.peek().sum_dist > min_dist2[Q.peek().node_id]){

						Q.poll();

					}else{

						for(int k = 1; k <= MAX; k++){

							int loc = Q.peek().node_id+k;
							if(loc >= N+1){

								min_dist2[N+1] = Q.peek().node_id+1;
								break;
							}

							loc += table[loc];

							if(loc >= N+1){

								min_dist2[N+1] = Q.peek().node_id+1;
								break;
							}else if(loc <= 0){

								loc = 0;
							}


							if(min_dist2[loc] > Q.peek().sum_dist+1){
								min_dist2[loc] = Q.peek().sum_dist+1;
								Q.add(new Info(loc,min_dist2[loc]));
							}
						}
						if(min_dist2[N+1] != BIG_NUM){

							break;
						}

						Q.poll();
					}
				}

				while(!Q.isEmpty())Q.poll();

				if(min_dist2[N+1] == BIG_NUM){
					FLG = false;
					break;
				}
			}

			if(FLG){

				ans.append("OK\n");
			}else{

				ans.append("NG\n");
			}
		}
		System.out.print(ans.toString());
	}
}

class Info implements Comparable<Info>{
	public int node_id;
	public int sum_dist;

	Info(int arg_node_id,int arg_sum_dist){
		this.node_id = arg_node_id;
		this.sum_dist = arg_sum_dist;
	}

	public int compareTo(Info arg){
		if(this.sum_dist < arg.sum_dist)return -1;
		if(this.sum_dist > arg.sum_dist)return 1;
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

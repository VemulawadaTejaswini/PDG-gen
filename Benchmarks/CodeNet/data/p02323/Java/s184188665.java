import java.util.ArrayList;
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

		int V = scanner.nextInt();
		int E = scanner.nextInt();

		int POW[] = new int[V+1];
		POW[0] = 1;
		for(int i = 1; i <= V; i++){

			POW[i] = POW[i-1]*2;
		}

		ArrayList<Edge> G[] = new ArrayList[V];
		for(int i = 0; i < V; i++){

			G[i] = new ArrayList<Edge>();
		}

		for(int loop = 0; loop < E; loop++){

			int from = scanner.nextInt();
			int to = scanner.nextInt();
			int weight = scanner.nextInt();

			G[from].add(new Edge(to,weight));
		}

		int dp[][] = new int[POW[V]][V];

		for(int state = 0; state < POW[V]; state++){
			for(int last_node = 0; last_node < V; last_node++){
				dp[state][last_node] = BIG_NUM;
			}
		}

		//頂点0スタート0戻り
		int base = 0;

		dp[POW[0]][0] = 0;

		for(int state = 1; state < POW[V]-1; state++){
			for(int last_node = 0; last_node < V; last_node++){
				if(dp[state][last_node] == BIG_NUM)continue;

				for(int i = 0; i < G[last_node].size(); i++){

					int next_node = G[last_node].get(i).to;
					if((state & POW[next_node]) != 0)continue;

					int next_state = state+POW[next_node];

					dp[next_state][next_node] = Math.min(dp[next_state][next_node], dp[state][last_node]+G[last_node].get(i).weight);
				}
			}
		}

		int ans = BIG_NUM;
		for(int last_node = 1; last_node < V; last_node++){
			for(int i = 0; i < G[last_node].size(); i++){
				if(G[last_node].get(i).to != base)continue;

				ans = Math.min(ans,dp[POW[V]-1][last_node]+G[last_node].get(i).weight);
			}
		}

		if(ans == BIG_NUM){

			System.out.println("-1");

		}else{

			System.out.println(ans);
		}
	}
}

class Edge{
	Edge(int arg_to,int arg_weight){
		to = arg_to;
		weight = arg_weight;
	}
	int to,weight;
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

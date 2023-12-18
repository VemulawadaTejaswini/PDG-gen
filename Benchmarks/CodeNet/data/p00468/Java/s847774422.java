import java.util.ArrayList;
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

		int SIZE = 505;
		int min_dist[] = new int[SIZE];
		ArrayList<Edge> list[] = new ArrayList[SIZE];

		for(int i = 0; i < SIZE; i++){

			list[i] = new ArrayList<Edge>();
		}

		int base = 0;

		while(true){

			int V = scanner.nextInt();
			int E = scanner.nextInt();

			if(V == 0 && E == 0)break;

			for(int i = 0; i < V; i++){

				min_dist[i] = BIG_NUM;
				list[i].clear();
			}

			for(int loop = 0; loop < E; loop++){

				int from = scanner.nextInt();
				int to = scanner.nextInt();
				from--;
				to--;

				list[from].add(new Edge(to,1));
				list[to].add(new Edge(from,1));
			}

			PriorityQueue<Info> Q = new PriorityQueue<Info>();
			min_dist[base] = 0;
			Q.add(new Info(base,0));

			while(!Q.isEmpty()){

				if(Q.peek().sum_dist > min_dist[Q.peek().node_id]){

					Q.poll();

				}else{

					for(int i = 0; i < list[Q.peek().node_id].size(); i++){

						int next_node = list[Q.peek().node_id].get(i).to;
						int next_dist = Q.peek().sum_dist+1;

						if(min_dist[next_node] > next_dist){

							min_dist[next_node] = next_dist;
							Q.add(new Info(next_node,next_dist));
						}
					}
					Q.poll();
				}
			}

			int ans = 0;

			for(int i = 1; i < V; i++){
				if(min_dist[i] <= 2)ans++;
			}

			System.out.println(ans);
		}
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


class Edge{

	public int to;
	public int dist;

	Edge(int arg_to,int arg_dist){
		to = arg_to;
		dist = arg_dist;
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

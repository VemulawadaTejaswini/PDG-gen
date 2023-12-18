import java.util.ArrayList;
import java.util.List;
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

		int SIZE = 1005;

		Info info[] = new Info[5*SIZE];
		for(int i = 0; i < 5*SIZE; i++){

			info[i] = new Info();
		}

		char base_map[][] = new char[SIZE][SIZE];

		int min_dist[] = new int[5*SIZE];
		int table[] = {1,2,3,4,5};

		List<Integer> list[] = new ArrayList[6];
        for(int i = 1; i <= 5; i++){

            list[i] = new ArrayList<Integer>();
        }

        int start_row = 0,start_col = 0,goal_row = 0,goal_col = 0;
        int num_creature;

        StringBuilder ans = new StringBuilder();

        while(true){

        	int W = scanner.nextInt();
        	int H = scanner.nextInt();

        	if(W == 0 && H == 0)break;

        	for(int i = 1; i <= 5; i++){

        		list[i].clear();
        	}

        	num_creature = 0;

        	for(int row = 0; row < H; row++){

        		char work[] = scanner.next().toCharArray();
        		for(int col = 0; col < W; col++){

        			base_map[row][col] = work[col];
        			if(base_map[row][col] == '.')continue;

        			if(base_map[row][col] >= '1' && base_map[row][col] <= '5'){

        				info[num_creature].set(row, col);
        				list[base_map[row][col]-'0'].add(num_creature++);

        			}else if(base_map[row][col] == 'S'){

        				start_row = row;
        				start_col = col;

        			}else{

        				goal_row = row;
        				goal_col = col;
        			}
        		}
        	}

        	int ans_start = -1;
    		int minimum = BIG_NUM;

        	for(int start = 0; start <= 4; start++){ //tableにおける、最初に一緒にいるパチクリの番号

        		for(int i = 0; i < num_creature; i++){

        			min_dist[i] = BIG_NUM;
        		}

        		int from = table[start],to = table[(start+1)%5];

        		//スタートから最初のパチクリへ
        		for(int i = 0; i < list[to].size(); i++){

        			int next = list[to].get(i);
        			min_dist[next] = Math.abs(start_row-info[next].row)+Math.abs(start_col-info[next].col);
        		}

        		for(int add = 2; add <= 4; add++){
        			from = to;
        			to = table[(start+add)%5];

        			for(int i = 0; i < list[from].size(); i++){
        				int from_node = list[from].get(i);
        				for(int k = 0; k < list[to].size(); k++){
        					int to_node = list[to].get(k);

        					min_dist[to_node] = Math.min(min_dist[to_node], min_dist[from_node]
        							+Math.abs(info[from_node].row-info[to_node].row)+Math.abs(info[from_node].col-info[to_node].col));
        				}
        			}
        		}

        		//最後のパチクリからゴールへ
        		from = to;
        		for(int i = 0; i < list[from].size(); i++){
        			int from_node = list[from].get(i);

        			if(minimum > min_dist[from_node]
        					+Math.abs(info[from_node].row-goal_row)+Math.abs(info[from_node].col-goal_col)){
        				minimum = min_dist[from_node]
            					+Math.abs(info[from_node].row-goal_row)+Math.abs(info[from_node].col-goal_col);
        				ans_start = table[start];
        			}
        		}
        	}

			if(minimum == BIG_NUM){

				ans.append("NA\n");
			}else{

				ans.append(Integer.toString(ans_start)).append(" ").append(Integer.toString(minimum)).append("\n");
			}
        }
        System.out.print(ans.toString());
	}
}

class Info{

	public int row;
	public int col;

	public void set(int arg_row,int arg_col){
		row = arg_row;
		col = arg_col;
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

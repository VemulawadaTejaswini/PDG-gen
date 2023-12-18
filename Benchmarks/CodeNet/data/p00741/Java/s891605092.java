import java.util.ArrayDeque;
import java.util.Queue;
import java.util.Scanner;

public class Main {

	public static final int BIG_NUM = 2000000000;
	public static final int MOD = 1000000007;
	public static final long HUGE_NUM = 99999999999999999L;
	public static final double EPS = 0.000000001;

	public static int H,W;

	@SuppressWarnings("unchecked")
	public static void main(String[] args) {

		//BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		Scanner scanner = new Scanner(System.in);

		int SIZE = 55;
		int table[][] = new int[SIZE][SIZE];
		int diff_row[] = {-1,-1,-1,0,0,1,1,1};
		int diff_col[] = {-1,0,1,-1,1,-1,0,1};

		StringBuilder ans = new StringBuilder();

		Queue<Info> Q = new ArrayDeque<Info>();

		while(true){

			W = scanner.nextInt();
			H = scanner.nextInt();

			if(W == 0 && H == 0)break;

			for(int row = 0; row < H; row++){
				for(int col = 0; col < W; col++){

					table[row][col] = scanner.nextInt();
				}
			}

			int num_island = 0;

			for(int row = 0; row < H; row++){
				for(int col = 0; col < W; col++){
					if(table[row][col] == 0)continue;

					num_island++;
					table[row][col] = 0;

					Q.add(new Info(row,col));

					while(!Q.isEmpty()){

						for(int i = 0; i < 8; i++){

							int adj_row = Q.peek().row+diff_row[i];
							int adj_col = Q.peek().col+diff_col[i];

							if(rangeCheck(adj_row,adj_col) == false || table[adj_row][adj_col] == 0)continue;

							table[adj_row][adj_col] = 0;
							Q.add(new Info(adj_row,adj_col));
						}
						Q.poll();
					}
				}
			}
			ans.append(Integer.toString(num_island)).append("\n");
		}
		System.out.print(ans.toString());
	}

	public static boolean rangeCheck(int row,int col){

		return row >= 0 && row <= H-1 && col >= 0 && col <= W-1;
	}
}

class Info{

	public int row;
	public int col;

	Info(int arg_row,int arg_col){

		row = arg_row;
		col = arg_col;
	}
}

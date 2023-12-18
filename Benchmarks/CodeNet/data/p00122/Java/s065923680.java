import java.util.ArrayList;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Main {

	public static final int BIG_NUM = 2000000000;
	public static final int MOD = 1000000007;
	public static final long HUGE_NUM = 99999999999999999L;
	public static final double EPS = 0.000000001;

	public static final int H = 10;
	public static final int W = 10;

	@SuppressWarnings("unchecked")
	public static void main(String[] args) {

		//BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		Scanner scanner = new Scanner(System.in);

		StringBuilder ans = new StringBuilder();
		int NOT = 0,SAFE = 1,ALIVE = 2;
		int table[][] = new int[H][W];

		//蛙の移動先
		int diff_row[] = {-2,-2,-2,-1,-1,0,0,1,1,2,2,2};
		int diff_col[] = {-1,0,1,-2,2,-2,2,-2,2,-1,0,1};

		ArrayList<LOC> WATER = new ArrayList<LOC>();
		ArrayList<LOC> FROG = new ArrayList<LOC>();

		while(true){

			int first_col = scanner.nextInt();
			int first_row = scanner.nextInt();

			if(first_col == 0 && first_row == 0)break;

			WATER.clear();

			int N = scanner.nextInt();

			for(int loop = 0; loop < N; loop++){

				int tmp_col = scanner.nextInt();
				int tmp_row = scanner.nextInt();

				WATER.add(new LOC(tmp_row,tmp_col));
			}

			FROG.clear();
			FROG.add(new LOC(first_row,first_col));

			boolean FLG = true;

			for(int i = 0; i < WATER.size(); i++){

				FLG = false;

				for(int row = 0; row < H; row++){
					for(int col = 0; col < W; col++){
						table[row][col] = NOT;
					}
				}

				int base_row = WATER.get(i).row;
				int base_col = WATER.get(i).col;

				for(int d_row = -1; d_row <= 1; d_row++){
					for(int d_col = -1; d_col <= 1; d_col++){

						if(!rangeCheck(base_row+d_row,base_col+d_col))continue;

						table[base_row+d_row][base_col+d_col] = SAFE;
					}
				}

				for(int k = 0; k < FROG.size(); k++){

					base_row = FROG.get(k).row;
					base_col = FROG.get(k).col;

					for(int p = 0; p < 12; p++){
						int adj_row = base_row+diff_row[p];
						int adj_col = base_col+diff_col[p];

						if(rangeCheck(adj_row,adj_col) == false || table[adj_row][adj_col] == NOT)continue;

						table[adj_row][adj_col] = ALIVE;
						FLG = true;
					}
				}

				if(!FLG)break;
				FROG.clear();

				for(int row = 0; row < H; row++){
					for(int col = 0; col < W; col++){
						if(table[row][col] == ALIVE){

							FROG.add(new LOC(row,col));
						}
					}
				}
			}

			if(FLG){

				ans.append("OK\n");

			}else{

				ans.append("NA\n");
			}
		}

		System.out.print(ans.toString());
	}

	public static boolean rangeCheck(int row,int col){

		return row >= 0 && row <= H-1 && col >= 0 && col <= W-1;
	}
}


class LOC{
	LOC(int arg_row,int arg_col){
		row = arg_row;
		col = arg_col;
	}
	public int row;
	public int col;
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

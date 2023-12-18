//Volume0-0089
import java.util.Scanner;

public class Main {

    //declare
	private static final int     WIDTH  = 50,
			                     HEIGHT = 99;
	private static       int     l;
    private static       int[][] route  = new int[HEIGHT][WIDTH],
    		                     table,
   		                         cost;

	public static void main(String[] args){

        String[] s;

        //input
        Scanner sc = new Scanner(System.in);

        int i;
        for(i=0;sc.hasNext();i++){
        	s = sc.nextLine().split(",");
        	for(int j=0;j<s.length;j++){
        		route[i][j] = Integer.parseInt(s[j]);
        	}
        }
        chg_tbl(i);

        //calculate,output
        System.out.println(dp());
	}

	private static void chg_tbl(int line_cnt){

		l = line_cnt/2+1;
		table = new int[l][l];

		for(int i=0;i<l;i++){
			for(int j=0;j<l-i;j++){
				table[i][j] = route[i+j][j];
			}
		}

		for(int i=1;i<l;i++){
			for(int j=l-i;j<l;j++){
				table[i][j] = route[i+j][l-i-1];
			}
		}
	}

	private static int dp(){

		int L = l+1;
		cost = new int[L][L];

		for(int i=1;i<L;i++){
			for(int j=1;j<L;j++){
				if( cost[i-1][j] > cost[i][j-1]){
					cost[i][j] = cost[i-1][j] + table[i-1][j-1];
				} else {
					cost[i][j] = cost[i][j-1] + table[i-1][j-1];
				}
			}
		}
		return cost[l][l];
	}
}
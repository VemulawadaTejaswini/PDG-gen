//Volume0-0092
import java.util.Scanner;

public class Main {

	//declare
	private static int        n,len;
	private static char  [][] board;

	public static void main(String[] args) {

        //input
        Scanner sc = new Scanner(System.in);
        while((n = Integer.parseInt(sc.nextLine())) != 0){
        	board = new char[n][n];
        	for(int i=0;i<n;i++){
        		board[i] = sc.nextLine().toCharArray();
        	}

        	//calculate,output
        	System.out.println(check());
        }
	}

	//It is investigated whether it is a square.
	private static int check(){
		int max = 0;
		for(int i=0;i<n;i++){
			for(int j=0;j<n;j++){
				if(board[i][j] == '.'){
					len = mesrlen(i,j);
					if(max < len){max=len;}
				}
			}
		}
		return max;
	}

	//The length of the square neighborhood is measured.
	private static int mesrlen(int x,int y){
		int ret = 1;
		int e_x = x + 1;
		int e_y = y + 1;

		out:while(true){
			if(e_x >= n || e_y >= n){break;}
			for(int i=x;i<e_x;i++){
				if(board[i][e_y] == '*'){
					break out;
				}
			}
			for(int i=y;i<=e_y;i++){
				if(board[e_x][i] == '*'){
					break out;
				}
			}
			e_x++; e_y++; ret++;
		}
		return ret;
	}
}
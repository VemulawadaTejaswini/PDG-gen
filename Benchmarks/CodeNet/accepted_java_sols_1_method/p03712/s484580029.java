import java.util.ArrayList;
import java.util.Scanner;

class Main{

	static int N;
	static int M;
	static 		ArrayList<ArrayList<Integer>> map;
	static boolean[] used;
	static int f = 0;
	static int s = 0;

	static long mod = 1000000007;
	static ArrayList<Integer> saitan;




	public static void main(String[] args) {


		Scanner sc = new Scanner(System.in);			//文字の入力
		int h = sc.nextInt();
		int w = sc.nextInt();
		char mozi[][] = new char[h][w];

		for(int i = 0;i < h;i++){
			mozi[i] = sc.next().toCharArray();

		}

		for(int i = 0;i < h+2;i++){
			for(int j = 0;j < w+2;j++){
				if(i == 0 || i == h+1 || j == 0 | j == w+1){
					System.out.print("#");
				}else{
					System.out.print(mozi[i-1][j-1]);
				}

			}
			System.out.println();
		}



	}


}



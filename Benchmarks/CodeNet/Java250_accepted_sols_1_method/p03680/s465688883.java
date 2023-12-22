import java.util.ArrayList;
import java.util.Scanner;

class Main{

	static int N;
	static int M;
	static 		ArrayList<ArrayList<Integer>> map;
	static boolean[] used;
	static int f = 0;
	static int s = 0;

	static int mindis = 1000000000;
	static ArrayList<Integer> saitan;




	public static void main(String[] args) {


		Scanner sc = new Scanner(System.in);			//文字の入力
		int n = sc.nextInt();
		int[] a = new int[n+1];
		for(int i= 1;i <= n;i++){
			a[i] = sc.nextInt();
		}
		boolean[] used = new boolean[n+1];
		int c =0;
		int p= 1;
		for(int i= 1;i <= n;i++){

			if(used[p]){
				System.out.println(-1);
				return;
			}
			if(p == 2){
				System.out.println(c);
				return;
			}
			c++;

			used[p] = true;
			p = a[p];
			
		}
		
		
		
	}

}



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
		int n = sc.nextInt();
		int a = sc.nextInt();
		int b = sc.nextInt();
		long[] h = new long[n];


		for(int i = 0;i < n;i++){
			h[i] = sc.nextLong();
		}


		long min = 0;
		long max = 1000000000;
		long T = 0;
		int k= 0;

		while(max - min > 1){
			T =( max + min)/2;
			k = 0;
			for(int i = 0;i <n;i++){
				if(h[i] > b*T){
					k += Math.ceil( (double)(h[i] - b*T) / (double)(a-b));
				}
			}

			if(k > T){
				min = T;
			}else{
				max = T;
			}


		}
		System.out.println(max);






	}


}



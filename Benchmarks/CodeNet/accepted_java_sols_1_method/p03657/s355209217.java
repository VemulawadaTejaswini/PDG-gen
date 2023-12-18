import java.util.ArrayList;
import java.util.Scanner;

class Main{

	static int N;
	static int M;
	static 		ArrayList<ArrayList<Integer>> map;



	public static void main(String[] args) {


		Scanner sc = new Scanner(System.in);			//文字の入力
		N = sc.nextInt();
		M = sc.nextInt();
		if(N % 3 == 0 || M % 3 == 0 || (N+M) % 3 == 0 ){
			System.out.println("Possible");
		}else{
			System.out.println("Impossible");

		}

	}

}



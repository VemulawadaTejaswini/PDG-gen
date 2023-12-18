import java.util.ArrayList;
import java.util.Arrays;
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
		int[] data = new int[3];
		for(int i = 0;i <3;i++){
			data[i] = sc.nextInt();
		}
		Arrays.sort(data);
		System.out.println(data[0]+data[1]);
		
	}

}



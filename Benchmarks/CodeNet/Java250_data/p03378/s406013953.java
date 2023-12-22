import java.util.Scanner;

class Main{

	static char[][] map;
	//	static int N;
	//	static int M;
	static boolean flag;
	static int ans;



	public static void main(String[] args) {



		Scanner sc = new Scanner(System.in);			//文字の入力
		int N =sc.nextInt();
		int M = sc.nextInt();
		int X = sc.nextInt();
		int[] A = new int[N+1];

		for(int i = 0;i < M;i++){
			A[sc.nextInt()] ++;

		}
		int sub = 0;
		for(int i =X+1;i <= N ;i++){
			if(A[i] > 0){
				sub ++;
			}
		}
		
		int sub2 = 0;
		for(int i =X-1;i>= 0 ;i--){
			if(A[i] > 0){
				sub2 ++;
			}
		}
		System.out.println(Math.min(sub, sub2));


	}


}

class Pair implements Comparable{
	String from;
	int end;
	@Override
	public int compareTo(Object other) {
		Pair otherpair = (Pair)other;

		return end - otherpair.end;
	}
}




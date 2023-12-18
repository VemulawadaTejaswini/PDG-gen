import java.util.*;

class Main{

	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);

		int N = sc.nextInt();
		int M = sc.nextInt();
		int X = sc.nextInt();
		int Y = sc.nextInt();

		String ans = "War";

		int max = -101;
		int min = 100;

		for(int i = 0; i < N; i++){
			int x = sc.nextInt();
			max = Math.max(max, x);
		}

		for(int j = 0; j < M; j++){
			int y = sc.nextInt();
			min = Math.min(min, y);
		}

		int cnt = min - max;
		int Z = min;
		
		for(int j = 0; j<cnt; j++){
			Z = min - j;
		if(max<Z && min >= Z && X<Z && Y >=Z){
			ans = "No War";
		}
	}

	System.out.println(ans);


	}
}
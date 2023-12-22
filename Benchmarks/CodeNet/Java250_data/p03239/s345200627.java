import java.util.*;

class Main{

	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);

		int N = sc.nextInt();
		int T = sc.nextInt();
		int min = 1001;
		String ans = "TLE";

		for(int i = 0; i < N; i++){
			int c = sc.nextInt();
			int t = sc.nextInt(); 

			if((c < min) && (t <= T)){
				min = c;
				ans = "" + c;
			}
		}
		System.out.println(ans);


	}
}
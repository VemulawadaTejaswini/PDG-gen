import java.util.*;
public class Main {
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);

		// 整数の入力
		int N = sc.nextInt();
		int Q = sc.nextInt();

		// 文字列の入力
		String s = sc.next();
		String[] S = s.split("");
		int[] splitL = new int[N+1];
		int cnt = 0;

		for(int i=2;i<=N;i++){
			if(S[i-2].equals("A")&&S[i-1].equals("C"))cnt++;
			splitL[i]=cnt;
		}

		for(int i=0;i<Q;i++){
			int lq = sc.nextInt();
			int rq = sc.nextInt();

			// 出力
			System.out.println(splitL[rq]-splitL[lq]);
		}
	}
}
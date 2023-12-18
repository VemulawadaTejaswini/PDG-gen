import java.util.*;
public class Main {

	public static void main(String[] args) {
		while(true){
			Scanner in = new Scanner(System.in);
			int N = in.nextInt();
			int K = in.nextInt();
			if(N == 0 && K == 0) break;
			int [] S = new int [K];
			boolean judge = true;
			for(int i = 0; i < K; i++){
				S[i] = in.nextInt();
			}
			for(int i = 0; i < N; i++){
				for(int m = 0; m < K; m++){
					S[m] -= in.nextInt();
					if(S[m] < 0) judge = false;
				}
			}
			if(judge)System.out.println("YES");
			else System.out.println("NO");
		}
	}

}
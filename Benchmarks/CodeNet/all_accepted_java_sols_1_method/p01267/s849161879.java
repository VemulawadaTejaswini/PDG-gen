import java.util.*;
public class Main {
	static Scanner in = new Scanner(System.in);
	public static void main(String[] args) {
		while(true){
			int N = in.nextInt();
			int A = in.nextInt();
			int B = in.nextInt();
			int C = in.nextInt();
			int X = in.nextInt();
			int[] Y = new int[N];
			if(N == A && A == B && B == C && C == X && X == 0) break;
			for(int i = 0; i < N; i++){
				Y[i] = in.nextInt();
			}
			int cnt = 0;
			int idx = 0;
			while(true){
				if(X == Y[idx]){
					idx++;
				}
				if(Y.length == idx) break;
				X = (A * X + B) % C;
				cnt++;
				if(cnt > 10000){
					cnt = -1;
					break;
				}
			}
			System.out.println(cnt);
		}
	}

}
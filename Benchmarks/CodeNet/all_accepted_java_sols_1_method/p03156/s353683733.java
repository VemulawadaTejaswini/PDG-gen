import java.util.*;

public class Main {
	public static void main(String[] args) throws Exception {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int A = sc.nextInt();
		int B = sc.nextInt();
		int[] P = new int [N];
		int[] G = new int [3];
		for (int i = 0; i < 3; i++){
			G[i] = 0;
		}
		for (int j = 0; j < N; j++){
			P[j] = sc.nextInt();
			if (P[j] <= A){
				G[0]++;
			}
			else if (P[j] > B){
				G[2]++;
			}
			else G[1]++;
		}
		if (G[0] < G[1] && G[0] < G[2]){
			System.out.println(G[0]);
		}else if (G[1] < G[0] && G[1] < G[2]){
			System.out.println(G[1]);
		}else{
			System.out.println(G[2]);
		}
	}
}

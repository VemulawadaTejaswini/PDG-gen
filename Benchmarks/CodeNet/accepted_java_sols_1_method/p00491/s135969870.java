
import java.util.*;
public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int day, sumptn = 0;
		int N = sc.nextInt();
		int K = sc.nextInt();
		int[] plan = new int[N];
		int[][] pattern = new int[N][6];
		for(int i = 0; i < K; i++) {
			day = sc.nextInt();
			plan[day-1] = sc.nextInt();
			}
		if(plan[0] == 0) {
			for(int i = 0; i < 3; i++) pattern[0][i] = 1;
		}
		else pattern[0][plan[0]-1] = 1;
		
		for(int i= 1; i < N; i++) {
			for(int k = 0; k < 6; k++) sumptn += pattern[i-1][k]%10000;

				if(plan[i] == 0) {//予定がない場合
					for(int j = 0; j < 6; j++) {
					if(j<3) pattern[i][j] = (sumptn-pattern[i-1][j]-pattern[i-1][j+3])%10000;
					else pattern[i][j] = pattern[i-1][j-3];
					}
				}
					else {//予定がある場合
						pattern[i][plan[i]-1] = (sumptn-pattern[i-1][plan[i]-1]-pattern[i-1][plan[i]+2])%10000;
						pattern[i][plan[i]+2] = pattern[i-1][plan[i]-1];
				
				}
				sumptn = 0;
				if(i == N-1) for(int k = 0; k < 6; k++) sumptn += pattern[N-1][k]%10000;
		}
		System.out.println(sumptn%10000);
	}
}
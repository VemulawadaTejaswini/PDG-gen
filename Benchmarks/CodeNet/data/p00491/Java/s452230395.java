import java.util.*;
public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int day, sumptn = 0;
		int N = sc.nextInt();//予定を組む日数
		int K = sc.nextInt();//ソースが決まっている日数
		int[] plan = new int[N];
		int[][] pattern = new int[N][6];
		for(int i = 0; i < K; i++) {
			day = sc.nextInt();
			plan[day-1] = sc.nextInt();
		}
		if(plan[0] == 0) {pattern[0][0]=1; pattern[0][1]=1; pattern[0][2]=1;}
		else if(plan[0] == 1) pattern[0][0] = 1;
		else if(plan[0] == 2) pattern[0][1] = 1;
		else if(plan[0] == 3) pattern[0][2] = 1;
		
		for(int i= 1; i < N; i++) {
			for(int k = 0; k < 6; k++) sumptn += pattern[i-1][k]%=10000;
			for(int j = 0; j < 6; j++) {
				if(plan[i] == 0) {//予定がない場合
					if(j<3) pattern[i][j] = sumptn-pattern[i-1][j]-pattern[i-1][j+3];
					else pattern[i][j] = pattern[i-1][j-3];
				} else if(plan[i] == 1){//予定がある場合
					pattern[i][0] = sumptn-pattern[i-1][0]-pattern[i-1][3];
					pattern[i][3] = pattern[i-1][0];break;
				} else if(plan[i] == 2) {
					pattern[i][1] = sumptn-pattern[i-1][1]-pattern[i-1][4];
					pattern[i][4] = pattern[i-1][1];break;
				} else if(plan[i] == 3) {
					pattern[i][2] = sumptn-pattern[i-1][2]-pattern[i-1][5];
					pattern[i][5] = pattern[i-1][2];break;
				}
			}
			sumptn = 0;
		}
		 for(int j = 0; j < 6; j++) sumptn += pattern[N-1][j];
		System.out.println(sumptn%10000);
	}
}
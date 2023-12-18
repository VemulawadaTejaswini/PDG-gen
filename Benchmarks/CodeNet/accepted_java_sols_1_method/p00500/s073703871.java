import java.util.*;

public class Main {
	public static void main(String args[]){
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int[][] player = new int[N][];
		for(int i=0; i<N; ++i) player[i] = new int[5];//3はflg 4は和
		for(int i=0; i<N; ++i){
			for(int j=0; j<3; ++j){
				player[i][j] = sc.nextInt();
			}
			player[i][4]=0;
		}
		for(int k=0; k<3; ++k){
			for(int i=0; i<N; ++i){
				player[i][3]=1;
				for(int j=0; j<N; ++j){
					if(i!=j && player[i][k] == player[j][k]){
						player[i][3]=0;
					}
				}
				if(player[i][3]==1) player[i][4] += player[i][k];
			}
		}
		for(int i=0; i<N; ++i) System.out.println(player[i][4]);
	}
}
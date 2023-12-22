import java.util.*;

public class Main{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		//マスの数(N+1)
		int N = sc.nextInt();
		//コストのかかるマスの数
		int M = sc.nextInt();
		//初期位置
		int X = sc.nextInt();

		int[] costMasu = new int[M];

		for(int i = 0; i < M; i++){
		    costMasu[i] = sc.nextInt();
		}

		int cost2N = 0;
		int cost20 = 0;

		for(int j = X; j <= N; j++){
		    for(int k = 0; k < M; k++){
			if(costMasu[k] == j){
			    cost2N++;
			}
		    }
		}

		for(int l = X; l > 0; l--){
		    for(int m = 0; m < M; m++){
			if(costMasu[m] == l){
			    cost20++;
			}
		    }
		}

		if(cost2N <= cost20){
		    System.out.println(cost2N);
		}else{
		    System.out.println(cost20);
		}
	}
}
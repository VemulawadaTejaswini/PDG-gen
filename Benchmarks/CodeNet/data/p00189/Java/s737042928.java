import java.util.*;

public class Main{
	public static void main(String[] args){
		//Initialization
		Scanner sc = new Scanner(System.in);

		while(true){

		int roads = sc.nextInt();
		if(roads == 0){
			break;
		}
		int[][] data = new int[20][20];
		for(int s = 0; s < data.length; s++){
			data[s] = new int[data.length];
			Arrays.fill(data[s], 2000000);
		}

		for(int i = 0; i < data.length; i++){
			data[i][i] = 0;
		}

		int flag = -1;

		for(int i = 1; i <= roads; i++){
			int end1 = sc.nextInt();
			int end2 = sc.nextInt();
		 	int dist = sc.nextInt();
			data[end1][end2] = dist;
			data[end2][end1] = dist;

			flag = Math.max(Math.max(end1,end2),flag);
		}

		//Warshall-Floyd method
		for(int k = 0; k <= flag; k++){
			for(int i = 0; i <= flag; i++){
				for(int j = 0; j <= flag; j++){
					data[i][j] = Math.min(data[i][j], data[i][k] + data[k][j]);
				}
			}
		}

		int res = Integer.MAX_VALUE;
		int ans = -1;

		for(int i = 0; i <= flag; i++){
			int sum = 0;
			for(int k = 0; k <= flag; k++){
				sum = sum + data[i][k];
			}

			if(sum < res){
				res = sum;
				ans = i;
			}
		}
		System.out.println(ans + " " + res);
	}
	}
}
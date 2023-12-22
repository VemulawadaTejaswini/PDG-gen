import java.util.*;

public class Main {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		int n;
		int graph[][] = new int[2][101];

		// 入力
		n = scanner.nextInt();
		for(int i=0; i<2; i++){
			for(int j=0; j<n; j++){
				graph[i][j] = scanner.nextInt();
			}
		}

		//探索
		int value[][] = new int[2][101];
		int j=1;
		value[0][0] = graph[0][0];
		value[1][0] = graph[1][0]+graph[0][0];
                if(n > 1){
		value[0][1] = graph[0][1]+graph[0][0];
		while(true){
			if(value[0][j] + graph[1][j] > value[1][j-1] + graph[1][j]){
				value[1][j] =  value[0][j] + graph[1][j];
			}else{
				value[1][j] =  value[1][j-1] + graph[1][j];
			}

			if(j == n-1){
				break;
			}else{
				value[0][j+1] = value[0][j] + graph[0][j+1];
				j++;
			}
		}
		System.out.println(value[1][n-1]);
                }else{
		System.out.println(value[1][0]);
                }
		scanner.close();
	}
}
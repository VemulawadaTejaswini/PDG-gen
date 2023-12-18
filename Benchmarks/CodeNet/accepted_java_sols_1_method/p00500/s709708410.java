import java.util.*;

public class Main {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int N = scan.nextInt();
		int[][] num = new int[N][3];
		int num2 = 0;
		int[] res = new int[N];

		for(int i = 0; i < N; i++){
			for(int j = 0; j < 3; j++){
				num[i][j] = scan.nextInt();
			}
		}
		
		for(int i = 0; i < 3; i++){
			for(int j = 0; j < N; j++){
				num2 = num[j][i];
				for(int k = 0; k < N; k++){
					if(num2 == num[k][i]){   //同数
						if(j != k){   //同じ配列でない
							num[j][i] = 0;
							num[k][i] = 0;
						}
					}
				}
			}	
		}
		
		for(int i = 0; i < N; i++){
			for(int j = 0; j < 3; j++){
				res[i] += num[i][j];
			}
			System.out.println(res[i]);
		}
	}
}
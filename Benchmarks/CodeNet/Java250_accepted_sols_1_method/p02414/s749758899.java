import java.util.*;

public class Main{
	public static void main(String args[]){
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int m = sc.nextInt();
		int l = sc.nextInt();

		long[][] queueA = new long[n][m];
		long[][] queueB = new long[m][l];
		long[][] ans = new long[n][l];

		for(int i = 0; i < queueA.length;i++){
			for(int j = 0; j < queueA[i].length; j++){
				queueA[i][j] = sc.nextLong();
			}
		}
		for(int i = 0; i < queueB.length;i++){
			for(int j = 0; j < queueB[i].length; j++){
				queueB[i][j] = sc.nextLong();
			}
		}

		for(int i = 0; i < ans.length; i++){
			for(int j = 0; j < ans[i].length; j++){
				for(int k = 0; k < queueA[i].length; k++){
					ans[i][j] += queueA[i][k]*queueB[k][j];
				}
			}
		}

		for(int i = 0; i < ans.length; i++){
			for(int j = 0; j < ans[i].length; j++){
				if(j == ans[0].length - 1){
					System.out.println(ans[i][j]);
				}else{
					System.out.print(ans[i][j] + " ");
				}
			}
		}
	}
}


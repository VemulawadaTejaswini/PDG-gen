import java.util.Scanner;
public class Main {

	public static void main(String[] args) {
		// TODO ?????????????????????????????????????????????
		Scanner sc = new Scanner(System.in);
		int i, k, m;
		int n = sc.nextInt();
		int[][] score = new int [n + 1][3];
		int[][] score1 = new int [n + 1][3];
		int[] sum = new int [5];
		for(i = 0; i < n; i++){
			for(k = 0; k < 3; k++){
				score[i][k] = sc.nextInt();
			}
		}
		for(i = 0; i < n; i++){
			for(k = 0; k < 3; k++){
				score1[i][k] = score[i][k];
			}
		}
		for(k = 0; k < 3; k++){
			for(i = 0; i < n; i++){
				for(m = i + 1; m < n + 1; m++){
					if(score[i][k] == score[m - 1][k] && i != m){
						score1[i][k] = 0;
						score1[m - 1][k] = 0;
					}
				}
			}
		}
		for(i = 0; i < n; i++){
			sum[i] = 0;
			for(k = 0; k < 3; k++){
				sum[i] += score1[i][k];
			}
		}
		for(i = 0; i < n; i++){
			System.out.printf("%d\n", sum[i]);
		}
	}
 }
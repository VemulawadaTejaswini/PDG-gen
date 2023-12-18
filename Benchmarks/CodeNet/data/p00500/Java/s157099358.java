import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N, i, j, k;
        N = sc.nextInt();
        int score[][] = new int [N+1][3];
        int score2[][] = new int [N+1][3];
        for(i = 0; i < N; i++){
        	for(j = 0; j < 3; j++){
        		score[i][j] = sc.nextInt();
        	}
        }
        
        //配列コピー
        for(i = 0; i < N; i++){
        	for(j = 0; j < 3; j++){
        		score2[i][j] = score[i][j];
        	}
        }
        
        //同じ数字を書いたやつは0点
        for(i = 0; i < 3; i++){
        	for(j = 0; j < N; j++){
        		for(k = 0; k < N; k++){
        			if(score[j][i] == score[k][i] && j != k){
        				score2[j][i] = 0;
        			}
        		}
        	}
        }
        
        //点数計算
        for(i = 0; i < N; i++){
        	for(j = 1; j < 3; j++){
        		score2[i][0] += score2[i][j];
        	}
        }
        
        //出力
        for(i = 0; i < N; i++){
        	System.out.println(score2[i][0]);
        }
        
    }
}
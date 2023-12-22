import java.util.*;
    public class Main {
    	public static void main(String[] args){
    		Scanner sc = new Scanner(System.in);
    		// 整数の入力
    		int N = sc.nextInt();
    		int M = sc.nextInt();
    		int C = sc.nextInt();

            int[][] ar = new int[N][M];
            int[] arB= new int[M];
            
            for(int i=0; i<M; i++){
                arB[i]= sc.nextInt();
            }

            for(int i=0; i<N; i++){
                for(int j=0; j<M; j++){
                    ar[i][j] = sc.nextInt();
                }
            }

            int rslt=0;
            int ans =0;
            for(int i=0; i<N; i++){
                for(int j=0; j<M; j++){
                    rslt = rslt + arB[j]*ar[i][j];
                }
                if((rslt + C) >0){
                    ans++;
                }
                rslt=0;
            }

            // 出力
    		System.out.println(ans);
    	}
    }

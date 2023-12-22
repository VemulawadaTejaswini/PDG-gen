import java.util.*;

public class Main{
    
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);

        int H = sc.nextInt();
        int W = sc.nextInt();

        int[][] c = new int[10][10];
        for(int i = 0; i < 10; i++){
            for(int j = 0; j < 10; j++){
                c[i][j] = sc.nextInt();
            }
        }

        int[][] A = new int[H][W];
        int[] cnt = new int[10];
        for(int i = 0; i < H; i++){
            for(int j = 0; j < W; j++){
                A[i][j] = sc.nextInt();
                if(A[i][j] != -1){
                    cnt[A[i][j]]++;
                }
            }
        }
        
        for(int k = 0; k < 10; k++){
            for(int i = 0; i < 10; i++){
                for(int j = 0; j < 10; j++){
                    c[i][j] = Math.min(c[i][j], c[i][k]+c[k][j]);
                }
            }
        }
        long sum = 0;
        for(int i = 0; i < 10; i++){
            sum += c[i][1]*cnt[i];
        }
        sc.close();

        System.out.println(sum);

    }
}
import java.util.*;

public class Main{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        
        int N = sc.nextInt();
        int D = sc.nextInt();

        int[][] X = new int[N][D];

        for(int i = 0; i < N; i++){
            for(int j = 0; j < D; j++){
                X[i][j] = sc.nextInt();
            }
        }

        int count = 0;

        for(int i = 0; i < N-1; i++){
            for(int j = i+1; j < N; j++){
                int dis2 = 0;
                for(int k = 0; k < D; k++) {
                    dis2 += (X[i][k] - X[j][k]) * (X[i][k] - X[j][k]);
                }
                if (Math.sqrt(dis2) == (int)Math.sqrt(dis2))
                    count++;
            }
        }
        sc.close();
        System.out.println(count);
    }

}
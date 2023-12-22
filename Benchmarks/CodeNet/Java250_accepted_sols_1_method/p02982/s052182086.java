import java.util.*;

public class Main {
    public static void main(String[] args) throws Exception {

        Scanner sc = new Scanner(System.in);
        
        int N = sc.nextInt();
        int D = sc.nextInt();
        float[][] X = new float[N][D];
        for(int i = 0; i < N; i++){
            for(int j = 0; j < D; j++){
                X[i][j] = sc.nextFloat();
            }
        }

        int count = 0;
        for(int i = 0; i < N; i++){
            for(int j = i + 1; j < N; j++){
                double dis = 0;
                double dis2 = 0;
                for(int k = 0; k < D; k++){
                    dis2 += (X[i][k] - X[j][k]) * (X[i][k] - X[j][k]);
                }
                
                dis = Math.sqrt(dis2);
                if(dis -Math.floor(dis) == 0){
                    count++;
                }
            }
        }
        System.out.println(count);
    }
}

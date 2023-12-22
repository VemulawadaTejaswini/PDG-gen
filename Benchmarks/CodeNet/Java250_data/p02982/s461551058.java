import java.util.*;
import java.util.Collections;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = Integer.parseInt(sc.next());
        int D = Integer.parseInt(sc.next());
        int[][] x = new int[N][D];
        int count = 0;
        
        
        for(int i = 0; i < N; i++) {
            for(int j = 0; j < D; j++) {
                x[i][j] = Integer.parseInt(sc.next());
            }
        }
        
        
        for(int i = 0; i < N-1; i++) {
            for(int j = i+1; j < N; j++) {
                double[] dis = new double[D];
                double sum = 0; 
                for(int k = 0; k < D; k++) {
                    dis[k] = Math.pow(x[i][k] - x[j][k], 2);
                    sum += dis[k];
                }
                sum = Math.sqrt(sum);
                if(sum - (int)sum == 0) {
                    count++;
                }
            }
        }
        System.out.println(count);
        
    }
}
import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = Integer.parseInt(sc.next());
        int[][] a = new int[2][N];
        for(int i = 0; i < 2; i++) {
            for(int j = 0; j < N; j++) {
                a[i][j] = Integer.parseInt(sc.next());
            }
        }
        
        int max = 0;
        int sum = 0;
        for(int k = 0; k < N; k++) {
            sum = 0;
            int i = 0;
            for(int j = 0; j < N; j++) {
                if(k == j) {
                    sum += a[i][j];
                    i = 1;
                }
                sum += a[i][j];
            }
            if(sum > max) {
                max = sum;
            }
        }
        System.out.println(max);
        
    }
}
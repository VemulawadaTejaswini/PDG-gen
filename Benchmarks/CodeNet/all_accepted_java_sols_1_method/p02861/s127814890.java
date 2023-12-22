import java.util.*;

public class Main {
    public static void main(String[] args) throws Exception {
        // Your code here!
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[][] ary = new int[n][2];
        for (int i = 0; i < n; i++) {
            ary[i][0] = sc.nextInt();
            ary[i][1] = sc.nextInt();
        }
        double[][] array = new double[n][n];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                array[i][j] = Math.sqrt((ary[i][0] - ary[j][0]) * (ary[i][0] - ary[j][0]) + (ary[i][1] - ary[j][1]) * (ary[i][1] - ary[j][1]));
            }
        }
        
        double sum = 0;
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                if (i == j) continue;
                sum += array[i][j];
            }
        }
        
        System.out.println(sum / n);
    }
}

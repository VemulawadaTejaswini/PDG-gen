import java.util.*;

public class Main {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        int[] t = new int[n];
        int sum = 0;
        for(int i = 0; i < n; i++){
            t[i] = scan.nextInt();
            sum += t[i];
        }
        int m = scan.nextInt();
        int[][] px = new int[m][2];
        for(int i = 0; i < m; i++){
            for(int j = 0; j < 2; j++){
                px[i][j] = scan.nextInt();
            }
        }
        int out = 0;
        for(int i = 0; i < m; i++){
            out = sum - t[px[i][0] - 1] + px[i][1];
            System.out.println(out);
        }
    }
}
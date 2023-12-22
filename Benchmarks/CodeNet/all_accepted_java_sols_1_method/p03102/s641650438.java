import java.util.*;

public class Main{
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        int m = scan.nextInt();
        int c = scan.nextInt();
        int[] b = new int[m];
        for(int i = 0; i < m; i++) b[i] = scan.nextInt();
        int[][] a = new int[n][m];
        for(int i = 0; i < n; i++) for(int j = 0; j < m; j++) a[i][j] = scan.nextInt();
        int out = 0;
        for(int i = 0; i < n; i++){
            int sum = 0;
            for(int j = 0; j < m; j++){
                sum += a[i][j] * b[j];
            }
            sum += c;
            if(sum > 0) out++;
        }
        System.out.println(out);
        scan.close();
    }
}

import java.util.Scanner;
import java.util.Arrays;
public class Main{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        int[] x = new int[m];
        if(n >= m){
            System.out.println(0);
        }else{
            for(int i = 0; i < m; i++){
                x[i] = sc.nextInt();
            }
            Arrays.sort(x);
            int[] sa = new int[m - 1];
            for(int i = 0; i < m - 1; i++){
                sa[i] = Math.abs(x[i + 1] - x[i]);
            }
            Arrays.sort(sa);
            int ans = 0;
            for(int i = 0; i < m - n; i++){
                ans += sa[i];
            }
            System.out.println(ans);
        }
    }
}
import java.util.*;
public class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        int[] x = new int[m];
        int ans = 0;
        for(int i=0; i<m; i++){
            x[i] = sc.nextInt();
        }
        Arrays.sort(x);
        if(m>1){
            int[] y = new int[m-1];
            for(int i=0; i<m-1; i++){
                y[i] = x[i+1] - x[i];
            }
            Arrays.sort(y);
            for(int i=0; i<m-n; i++){
                ans += y[i];
            }
        }
        System.out.println(ans);
    }
}
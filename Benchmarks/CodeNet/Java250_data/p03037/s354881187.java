import java.util.*;
import static java.lang.Math.*;

public class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();

        int max_l = 0;
        int min_r = Integer.MAX_VALUE;

        for(int i = 0; i<m; i++){
            // if(m==1)
            int l = sc.nextInt();
            int r = sc.nextInt();
            max_l = max(l,max_l);
            min_r = min(r,min_r);
        }
        int ans =0;
        for(int i=1; i<=n; i++){
            if(i>=max_l && i<=min_r){
                ans++;
            }
        }
        System.out.println(ans);
    }
}
    
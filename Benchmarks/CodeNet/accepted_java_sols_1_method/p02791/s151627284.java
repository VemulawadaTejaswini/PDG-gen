import java.util.*;
 
public class Main{
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        int n = in.nextInt(), ans = 1;
        int a[];
        a = new int[n];
        for (int i = 0; i < n; i++)
            a[i] = in.nextInt();
        int mmin = a[0];
        for (int i = 1; i < n; i++){
            if (a[i] < mmin) ans++;
            mmin = Math.min(mmin, a[i]);
        }
        System.out.printf("%d\n", ans);
        in.close();
    }
}

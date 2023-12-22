import java.util.*;
import java.awt.*;
import static java.lang.System.*;
import static java.lang.Math.*;
public class Main {
    public static void main(String[] $) {
        Scanner sc = new Scanner(in);
        int n=sc.nextInt(),m=sc.nextInt();
        int[] x=new int[m];
        for (int i = 0; i < m; i++) {
            x[i]=sc.nextInt();
        }
        long ans=0;
        if(m<=n){
            out.println(ans);
        }else {
            Arrays.sort(x);
            int[] d=new int[m-1];
            for (int i = 0; i < m-1; i++) {
                d[i]=x[i+1]-x[i];
            }
            for (int k:d)ans+=k;
            Arrays.sort(d);
            for (int i = m-2; i > m-n-1; i--) {
                ans-=d[i];
            }
            out.println(ans);
        }
    }
}
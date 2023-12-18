import java.util.*;
import java.awt.*;
import static java.lang.System.*;
import static java.lang.Math.*;
public class Main {
    public static void main(String[] args){
        Scanner sc = new Scanner(in);
        int n=sc.nextInt();
        int[] a=new int[n+1];
        for (int i = 0; i < n; i++) {
            a[i]=sc.nextInt();
        }
        int[] b=new int[n];
        for (int i = 0; i < n; i++) {
            b[i]=sc.nextInt();
        }
        int[] c=new int[n+1];
        for (int i = 0; i < n; i++) {
            c[i]=sc.nextInt();
        }
        a[n]=1000000001;
        c[n]=1000000001;
        Arrays.sort(a);
        Arrays.sort(b);
        Arrays.sort(c);
        long ans=0,ai=0,ci=0;
        for (int i = 0; i < n; i++) {
            while(b[i]>a[(int)ai]){
                ai++;
            }
            while(b[i]>=c[(int)ci]){
                ci++;
            }
            ans+=ai*(n-ci);
        }
        out.println(ans);
    }
}
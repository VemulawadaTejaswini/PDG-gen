import java.util.*;
import java.awt.*;
import java.awt.geom.*;
import static java.lang.System.*;
import static java.lang.Math.*;
public class Main {
    public static void main(String[] $) {
        Scanner sc = new Scanner(in);
        int n=sc.nextInt();
        long ans=0;
        long[] c=new long[n];
        for (int i = 0; i < n; i++) {
            long A=sc.nextLong();
            long B=sc.nextLong();
            c[i]=A+B;
            ans-=B;
        }
        Arrays.sort(c);
        for (int i = 0; i < n; i+=2) {
            ans+=c[n-1-i];
        }
        out.println(ans);
    }
}
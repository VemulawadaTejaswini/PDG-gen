import java.util.*;
import java.awt.*;
import java.awt.geom.*;
import static java.lang.System.*;
import static java.lang.Math.*;
public class Main {
    public static void main(String[] $) {
        Scanner sc = new Scanner(in);
        int n=sc.nextInt();
        int[] h=new int[n+1];
        for (int i = 0; i < n; i++) {
            h[i]=sc.nextInt();
        }
        h[n]=0;
        long ans=0;
        int sum=1;
        while (sum>0) {
            sum=0;
            int c=0;
            for (int i = 0; i < n; i++) {
                if(h[i]>0){
                    h[i]--;
                    if(h[i+1]==0)c++;
                }
                sum+=h[i];
            }
            ans+=c;
        }
        out.println(ans);
    }
}
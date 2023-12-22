import java.util.*;
import java.awt.*;
import static java.lang.System.*;
import static java.lang.Math.*;
public class Main {
    public static void main(String[] args){
        Scanner sc = new Scanner(in);
        int n=sc.nextInt();
        int T=sc.nextInt();
        int[] t=new int[n];
        int[] c=new int[n];
        for (int i = 0; i < n; i++) {
            c[i]=sc.nextInt();
            t[i]=sc.nextInt();
        }
        int ans=114514;
        for (int i = 0; i < n; i++) {
            if(t[i]<=T)ans=min(ans,c[i]);
        }
        if(ans==114514){
            out.println("TLE");
        }else{
            out.println(ans);
        }
    }
}
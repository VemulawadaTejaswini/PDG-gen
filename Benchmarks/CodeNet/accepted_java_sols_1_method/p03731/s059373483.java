import java.util.*;
import java.awt.*;
import static java.lang.System.*;
import static java.lang.Math.*;
public class Main {
    public static void main(String[] args){
        Scanner sc = new Scanner(in);
        int N=sc.nextInt();
        int T=sc.nextInt();
        int[] t=new int[N];
        for (int i = 0; i < N; i++) {
            t[i]=sc.nextInt();
        }
        long ans=T;
        for (int i = 0; i < N-1; i++) {
            if(t[i+1]-t[i]>=T){
                ans+=T;
            }else{
                ans+=t[i+1]-t[i];
            }
        }
        out.println(ans);
    }
}
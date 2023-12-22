import java.util.*;
import java.awt.*;
import static java.lang.System.*;
import static java.lang.Math.*;
public class Main {
    public static void main(String[] args){
        Scanner sc = new Scanner(in);
        int ans=0;
        int n=sc.nextInt();
        int x=sc.nextInt();
        long[] a=new long[n];
        for (int i = 0; i < n; i++) {a[i]=sc.nextInt();}
        Arrays.sort(a);
        long[] b=new long[n+1];
        for (int i =1 ; i < 1+n; i++) {
            b[i]=a[i-1]+b[i-1];
        }
        for (int i = 1; i <= n; i++) {
            if(b[i]==x){
                ans=i;
                break;
            }else if(b[i]<x){
                ans++;
            }else{
                break;
            }
        }
        if(ans==n&&b[n]!=x)ans--;
        out.println(ans);
    }
}
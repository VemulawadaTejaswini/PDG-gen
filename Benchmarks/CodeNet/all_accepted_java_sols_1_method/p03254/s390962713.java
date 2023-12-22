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
        int[] a=new int[n];
        long sum=0;
        for (int i = 0; i < n; i++) {
            a[i]=sc.nextInt();
            sum+=a[i];
        }
        if(sum==x){
            ans=n;
        }else if(sum<x){
            ans=n-1;
        }else{
            Arrays.sort(a);
            for (int i = 0; i < n; i++) {
                x-=a[i];
                if(x>0){
                    ans++;
                }else if(x==0){
                    ans++;
                    break;
                }else{
                    break;
                }
            }
        }
        out.println(ans);
    }
}
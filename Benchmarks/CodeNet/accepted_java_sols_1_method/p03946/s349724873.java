import java.util.*;
import java.awt.*;
import static java.lang.System.*;
import static java.lang.Math.*;
//Loopで使う文字列の長さは固定！
//intで大丈夫？オーバーフローしない？
//Loop回数は本当に10⁹以内になってる？Loopは回る？？
public class Main {
    public static void main(String[] args){
        Scanner sc = new Scanner(in);
        int n=sc.nextInt();
        int t=sc.nextInt();
        int[] a=new int[n+1];
        int leftmin=1000000001;
        int dmax=0;
        int[] ansarr=new int[n+1];
        int count=0;
        for (int i = 1; i <= n; i++) {
            a[i]=sc.nextInt();
            leftmin=min(leftmin,a[i]);
            dmax=max(dmax,a[i]-leftmin);
            if(a[i]-leftmin==dmax){
                ansarr[i]=dmax;
            }
        }
        for (int i = 1; i <= n; i++) {
            if(dmax==ansarr[i])count++;
        }
        out.println(count);
    }
}
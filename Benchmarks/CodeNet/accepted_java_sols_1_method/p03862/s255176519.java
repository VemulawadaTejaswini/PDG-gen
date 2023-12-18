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
        int x=sc.nextInt();
        int[] a=new int[n];
        for (int i = 0; i < n; i++) {
            a[i]=sc.nextInt();
        }
        int temp=a[0];
        long ans=0;
        for (int i = 1; i < n; i++) {
            temp=a[i]+a[i-1];
            if(temp>x){
                ans+=temp-x;
                if(a[i]>=temp-x){
                    a[i]-=temp-x;
                }else{
                    a[i-1]-=temp-x-a[i];
                    a[i]=0;
                }
            }
            temp=0;
        }
        out.println(ans);
    }
}

import java.util.*;
import java.awt.*;
import static java.lang.System.*;
import static java.lang.Math.*;
//Loopで使う文字列の長さは固定！
//intで大丈夫？オーバーフローしない？
//Loop回数は本当に10⁹以内になってる？Loopは回る？？
public class Main {
    public static void main(String[]$){
        Scanner sc = new Scanner(in);
        int n=sc.nextInt();
        double t=sc.nextDouble();
        double a=sc.nextDouble();
        double[] h=new double[n];
        double[] ave=new double[n];
        int ans=0;
        double temp=114514;
        for (int i = 0; i < n; i++) {
            h[i]=sc.nextDouble();
            ave[i]=t-h[i]*0.006;
            if(temp>abs(a-ave[i])){
                temp=abs(a-ave[i]);
                ans=i+1;
            }
        }
        out.println(ans);
    }
}
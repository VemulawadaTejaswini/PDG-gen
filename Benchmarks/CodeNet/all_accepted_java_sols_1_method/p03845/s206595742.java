import java.util.*;
import java.awt.geom.Point2D;
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
        int[] t=new int[n];
        int sumt=0;
        for (int i = 0; i < n; i++) {
            t[i]=sc.nextInt();
            sumt+=t[i];
        }
        int m=sc.nextInt();
        int[] p=new int[m];
        int[] x=new int[m];
        for (int i = 0; i < m; i++) {
            p[i]=sc.nextInt();
            x[i]=sc.nextInt();
        }
        for (int i = 0; i < m; i++) {
            out.println(sumt-t[p[i]-1]+x[i]);
        }
    }
}
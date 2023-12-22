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
        String s=sc.next();
        int n=s.length();
        int ans=0;
        for (int i = 1; i < n; i++) {
            if(s.charAt(i-1)!=s.charAt(i))ans++;
        }
        out.println(ans);
    }
}
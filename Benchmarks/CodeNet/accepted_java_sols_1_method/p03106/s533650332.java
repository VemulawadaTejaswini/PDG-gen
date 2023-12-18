/*
String[]の初期化、整数の型がlongになっているか
関数（splitとかcontainsとか）内では"+"とかは正規表現となされるので"\\+"とする
配列のコピーはarr1=arr.clone()
HashSet<>[]はおのおの初期化した？？？？？
 */
import java.util.*;
import java.awt.*;
import java.awt.geom.*;
import static java.lang.System.*;
import static java.lang.Math.*;
public class Main {
    public static void main(String[] $) {
        Scanner sc = new Scanner(in);
        int a=sc.nextInt(),b=sc.nextInt(),k=sc.nextInt();
        int c=0,ans=0;
        ArrayDeque<Integer> st=new ArrayDeque<>();
        for (int i = 1; i < a + 1; i++) {
            if(a%i==0&&b%i==0)st.addFirst(i);
        }
        while (c<k){
            ans=st.pollFirst();
            c++;
        }
        out.println(ans);
    }
}
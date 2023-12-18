/*
String[]の初期化、整数の型がlongになっているか
関数（splitとかcontainsとか）内では"+"とかは正規表現となされるので"\\+"とする
配列のコピーはarr1=arr.clone()
HashSet<>[]はおのおの初期化した？？？？？
負の数の割り算は絶対値が小さいほうに切り捨てられるex.-1/2=0ので、ある値>kみたいな式だとバグらせやすいので注意
ある値>=kとして、切り上げた値をとるべき
 */
import java.util.*;
import java.awt.*;
import java.awt.Graphics.*;
import static java.lang.System.*;
import static java.lang.Math.*;
public class Main {
    public static void main(String[] $) {
        Scanner sc = new Scanner(in);
        String s=sc.nextLine();
        String ans="";
        for (int i = 0; i < s.length(); i++) {
            ans+=d(s.charAt(i));
        }
        out.println(ans);
    }
    static char d(char c){
        for (char i = 'a'; i <= 'z'; i++) {
            if(c==i)return Character.toUpperCase(i);
        }
        for (char i = 'A'; i <= 'Z'; i++) {
            if(c==i)return Character.toLowerCase(i);
        }
        return c;
    }
}

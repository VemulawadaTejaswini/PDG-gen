/*
String[]の初期化、整数の型がlongになっているか
関数（splitとかcontainsとか）内では"+"とかは正規表現となされるので"\\+"とする
配列のコピーはarr1=arr.clone()
HashSet<>[]はおのおの初期化した？？？？？
負の数の割り算は絶対値が小さいほうに切り捨てられるex.-1/2=0ので、ある値>kみたいな式だとバグらせやすいので注意
ある値>=kとして、切り上げた値をとるべき
toLowerCase()はアルファベット以外に対して行ってもエラーにはならない
 */
//入力終了→Ctrl+D
import java.util.*;
import java.awt.*;
import java.awt.Graphics.*;
import static java.lang.System.*;
import static java.lang.Math.*;
public class Main {
    public static void main(String[] $) {
        Scanner sc = new Scanner(in);
        int[] a=new int[6];
        for (int i = 0; i < 6; i++) {
            a[i]=sc.nextInt();
        }
        String s=sc.next();
        dice1.init(a);
        for (int i = 0; i < s.length(); i++) {
            dice1.roll(s.charAt(i));
        }
        out.println(dice1.men[0]);
    }
    static class dice1{
        static int[] men=new int[6];
        static void init(int[] a){
            for (int i = 0; i < 6; i++) {
                men[i]=a[i];
            }
        }
        static void roll(char c){
            int t=men[0];
            switch (c) {
                case 'S':
                    men[0]=men[4];
                    men[4]=men[5];
                    men[5]=men[1];
                    men[1]=t;
                    break;
                case 'E':
                    men[0]=men[3];
                    men[3]=men[5];
                    men[5]=men[2];
                    men[2]=t;
                    break;
                case 'W':
                    men[0]=men[2];
                    men[2]=men[5];
                    men[5]=men[3];
                    men[3]=t;
                    break;
                case 'N':
                    men[0]=men[1];
                    men[1]=men[5];
                    men[5]=men[4];
                    men[4]=t;
                    break;
                    default:
                        break;
            }
        }
    }
}

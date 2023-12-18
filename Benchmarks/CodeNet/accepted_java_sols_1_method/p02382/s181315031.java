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
        while (sc.hasNext()){
            int n=sc.nextInt();
            double[] x=new double[n];
            double[] y=new double[n];
            for (int i = 0; i < n; i++) {
                x[i]=sc.nextDouble();
            }
            double l1=0,l2=0,l3=0,l8=0;
            for (int i = 0; i < n; i++) {
                y[i]=abs(sc.nextDouble()-x[i]);
                l1+=y[i];
                l2+=pow(y[i],2);
                l3+=pow(y[i],3);
                l8=max(l8,y[i]);
            }
            out.println(l1);
            out.println(sqrt(l2));
            out.println(pow(l3,(double) 1/3));
            out.println(l8);
        }
    }
}

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
import java.time.Year;
import java.util.*;
import java.awt.*;
import java.awt.Graphics.*;
import static java.lang.System.*;
import static java.lang.Math.*;
public class Main {
    public static void main(String[] $) {
        Scanner sc = new Scanner(in);
        int n=sc.nextInt();
        int[] a=new int[n];
        for (int i = 0; i < n; i++) {
            a[i]=sc.nextInt();
            if(i<n-1)out.print(a[i]+" ");
            else out.println(a[i]);
        }
        for (int i = 1; i < n; i++) {
            int v=a[i];
            int j=i-1;
            while (j>=0&&a[j]>v){
                a[j+1]=a[j];
                j--;
            }
            a[j+1]=v;
            for(int k=0;k<n;k++){
                out.print(a[k]);
                if(k<n-1)out.print(" ");
            }
            out.println();
        }
    }
}

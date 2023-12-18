/*
文字列の配列の初期化、整数の型がlongになっているか
関数（splitとかcontainsとか）内では"+"とかは正規表現となされるので"\\+"とする
 */
import java.util.*;
import java.awt.*;
import java.awt.geom.*;
import static java.lang.System.*;
import static java.lang.Math.*;
public class Main {
    public static void main(String[] $) {
        Scanner sc = new Scanner(in);
        long k=sc.nextLong()+1,a=sc.nextLong(),b=sc.nextLong();
        long ans=0;
        if(a+2>=b){
            out.println(k);
        }else {
            long turn=0;
            while (turn<k){
                if(ans>=a&&turn+2<=k){
                    ans+=b-a;
                    turn+=2;
                }else{
                    ans++;
                    turn++;
                }
            }
            out.println(ans);
        }
        /*
        a回の操作でA枚ふやせる
        A+1回の操作で1円得られる
        A+2回の操作でB枚得られる
        A+2とBを比較してでかいほうを繰り返す→最後のほう（残り回数がA+2未満ならポケットを叩く操作だけ行う）
        初回はA+1回の操作でB枚得られる←k=k+1,初期0枚とすればよい
         */
    }
}
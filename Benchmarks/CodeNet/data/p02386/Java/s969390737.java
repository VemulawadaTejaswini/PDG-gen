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
        int[][] dice=new int[n][6];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < 6; j++) {
                dice[i][j]=sc.nextInt();
            }
        }
        String s = "";
        for (int i = 0; i < 4; i++) {
            s += "N";
        }
        for (int i = 0; i < 4; i++) {
            s += "E";
        }
        for (int b=0;b<n;b++) {
            for (int a = 0; a < n; a++) {
                if(a==b)break;
                for (int k = 0; k < s.length(); k++) {
                    for (int j = 0; j < 4; j++) {
                        if (Arrays.equals(dice[a], dice[b])) {
                            out.println("No");
                            exit(0);
                        }
                        roll(dice[b], 'L');
                    }
                    roll(dice[b], s.charAt(k));
                }
            }
        }
        out.println("Yes");
    }

    static void roll(int[] men,char c) {
        int t = men[0];
        switch (c) {
            case 'S':
                men[0] = men[4];
                men[4] = men[5];
                men[5] = men[1];
                men[1] = t;
                break;
            case 'E':
                men[0] = men[3];
                men[3] = men[5];
                men[5] = men[2];
                men[2] = t;
                break;
            case 'W':
                men[0] = men[2];
                men[2] = men[5];
                men[5] = men[3];
                men[3] = t;
                break;
            case 'N':
                men[0] = men[1];
                men[1] = men[5];
                men[5] = men[4];
                men[4] = t;
                break;
            case 'L':
                t=men[1];
                men[1]=men[3];
                men[3]=men[4];
                men[4]=men[2];
                men[2]=t;
                break;
            default:
                break;
        }
    }
}

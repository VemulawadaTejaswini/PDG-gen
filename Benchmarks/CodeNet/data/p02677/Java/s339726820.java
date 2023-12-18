import java.util.Scanner;

/*
問題文
問題文
時針と分針の長さがそれぞれ A センチメートル、
B センチメートルであるアナログ時計を考えます。

時針と分針それぞれの片方の端点は同じ定点に固定されており、
この点を中心としてそれぞれの針は一定の角速度で時計回りに回転します。時針は
12 時間で、分針は 1 時間で 1 周します。

0 時ちょうどに時針と分針は重なっていました。
ちょうど H 時 M 分になったとき、2 本の針の固定されていない方の
端点は何センチメートル離れているでしょうか。

制約
入力はすべて整数
1≤A,B≤1000
0≤H≤11
0≤M≤59

*/

public class Main {
    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int h = sc.nextInt();
        int m = sc.nextInt();

        double hour = 0.5 * (60 * h + m);
        double min = 6 * m;

        double angle = hour-min;

        if (hour < min) {
        	angle = 360 - min + hour;
        }

        double ans = a*a + b*b - 2*a*b * Math.cos(angle / 180 * Math.PI);
        System.out.println(String.format("%.20f", Math.sqrt(ans)));
    }
}
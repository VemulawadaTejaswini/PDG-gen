/*
String[]の初期化、整数の型がlongになっているか
関数（splitとかcontainsとか）内では"+"とかは正規表現となされるので"\\+"とする
配列のコピーはarr1=arr.clone()
HashSet<>[]はおのおの初期化した？？？？？
負の数の割り算は絶対値が小さいほうに切り捨てられるex.-1/2=0ので、ある値>kみたいな式だとバグらせやすいので注意
ある値>=kとして、切り上げた値をとるべき
toLowerCase()はアルファベット以外に対して行ってもエラーにはならない
ArrayDequeではpopとpushはStackと同じ操作になる
//import static java.lang.System.*; はしばらく使わなそう(使うとしてもexit(0)のためだけ)←return;でよさそう
最後にout.flush()またはout.close()をするのを忘れずに！
*/
//入力終了→Ctrl+D
import java.util.*;
import java.io.*;
import java.awt.*;
import java.awt.geom.Point2D;
import static java.lang.Math.*;
public class Main {
    public static void main(String[] $) {
        String s=sc.next();
        int n=s.length();
        ArrayDeque<Integer> st=new ArrayDeque<>();
        ArrayDeque<Point> ans=new ArrayDeque<>();
        for (int i = 0; i < n; i++) {
            char c = s.charAt(i);
            int t=0;
            if (c == '\\') {
                st.push(i);
            } else if (c == '/') {
                if(!st.isEmpty()){
                    int temp=st.pop();
                    if(ans.isEmpty()){
                        ans.push(new Point(temp,i-temp));
                    }else{
                        int w=i-temp;
                        while (ans.size()>0&&temp<ans.peek().x){
                            w+=ans.pop().y;
                        }
                        ans.push(new Point(temp,w));
                    }
                }
            }

        }


        out.println(sum(ans));
        out.print(ans.size());
        while (!ans.isEmpty()){
            out.print(" ");
            out.print(ans.pollLast().y);
        }
        out.println();
        out.close();
    }
    static int sum(ArrayDeque<Point> q){
        int res=0;
        for (Point i:q)res+=i.y;
        return res;
    }

    static PrintWriter out = new PrintWriter(System.out);

    static class sc {
        static Scanner s = new Scanner(System.in);

        static String next() {
            return s.next();
        }

        static int nextInt() {
            return Integer.parseInt(s.next());
        }

        static long nextLong() {
            return Long.parseLong(s.next());
        }

        static double nextDouble() {
            return Double.parseDouble(s.next());
        }
    }
}

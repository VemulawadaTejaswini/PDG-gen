
import java.io.*;
import java.util.*;
import static java.lang.Math.*;
public class Main {
    public static void main(String[] $) {
        int n=sc.nextInt();
        Solve(n,0,0,100,0);
        out.println(100+" "+0);
        out.close();
    }

    static void Solve(int n,double x1,double y1,double x2,double y2){
        if(n==0){
            out.println(x1+" "+y1);
            return;
        }
        //ベクトルと座標（位置ベクトル）の区別に気を付ける
        double x3=(x2-x1)/3;
        double y3=(y2-y1)/3;
        double sx=x3*cos(PI/3)-y3*sin(PI/3)+x3+x1;
        double sy=x3*sin(PI/3)+y3*cos(PI/3)+y3+y1;
        double tx=x3*2+x1;
        double ty=y3*2+y1;
        x3+=x1;
        y3+=y1;
        Solve(n-1,x1,y1,x3,y3);
        Solve(n-1,x3,y3,sx,sy);
        Solve(n-1,sx,sy,tx,ty);
        Solve(n-1,tx,ty,x2,y2);
    }

    static PrintWriter out = new PrintWriter(System.out);

    static class sc {
        static Scanner scanner = new Scanner(System.in);

        static String next() {
            return scanner.next();
        }

        static String nextLine() {
            return scanner.nextLine();
        }

        static int nextInt() {
            return Integer.parseInt(scanner.next());
        }

        static long nextLong() {
            return Long.parseLong(scanner.next());
        }

        static double nextDouble() {
            return Double.parseDouble(scanner.next());
        }

        static boolean hasNext() {
            return scanner.hasNext();
        }

        static boolean hasNextInt() {
            return scanner.hasNextInt();
        }

        static boolean hasNext(String str) {
            return scanner.hasNext(str);
        }
    }

}

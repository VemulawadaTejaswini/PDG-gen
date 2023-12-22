import java.util.*;
import java.io.*;
public class Main {
    static Scanner sc = new Scanner(System.in);
    static PrintWriter out = new PrintWriter(System.out);
    static BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
    long mod = 998244353;
    long[] frac, inv;
    public static void main(String[] args){
        Main main = new Main();
//        String ans = main.solve()<0?"No":"Yes";
        System.out.println(main.solve());
    }
    double solve(){
        double l = sc.nextDouble();
        l = l/3.0;
        return l*l*l;
    }
}

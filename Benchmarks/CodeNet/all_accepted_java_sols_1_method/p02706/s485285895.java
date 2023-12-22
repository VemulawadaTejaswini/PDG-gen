import java.text.DecimalFormat;
import java.util.function.BiFunction;
import java.util.function.Function;
import java.io.*;
import java.util.*;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        PrintWriter out = new PrintWriter(System.out);
//        DecimalFormat df = new DecimalFormat("0.00000000");

        final int N = Integer.parseInt(sc.next());
        final int M = Integer.parseInt(sc.next());
        int sum = 0;
        for (int i = 0; i < M; i++) {
            sum += Integer.parseInt(sc.next());
        }
        out.println(N >= sum ? N - sum : "-1");
        
        out.flush();
    }
}
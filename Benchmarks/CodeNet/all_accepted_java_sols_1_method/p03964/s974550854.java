
import java.io.*;
import java.util.*;
//import java.util.stream.*;
//import java.math.*;

public class Main {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        Scanner sc = new Scanner(System.in);
        int test = sc.nextInt();
        long T = 1, A = 1, t, a, n;
        for (int i = 0; i < test; i++) {
            t = sc.nextLong();
            a = sc.nextLong();
            n = Math.max((T + t - 1) / t, (A + a - 1) / a);
            T = n * t;
            A = n * a;
        }
        System.out.println(T + A);
        bw.flush();
    }
}

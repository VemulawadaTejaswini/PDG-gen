
import java.io.*;
import java.util.*;
//import java.util.stream.*;
//import java.math.*;

public class Main {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        Scanner sc = new Scanner(System.in);
        long n = sc.nextLong();
        long num = 1;
        for (int i = 1; i <= n; i++) {
            num = (long) (num * i % (Math.pow(10, 9) + 7));
        }
        System.out.println(num);
        bw.flush();
    }
}

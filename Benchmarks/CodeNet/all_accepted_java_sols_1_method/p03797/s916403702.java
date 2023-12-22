
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
        long m = sc.nextLong();
        long count = 0;
        if (n * 2 > m) {
            count = m / 2;
        } else {
            count = n + ((m - (n * 2)) / 4);
        }
        System.out.println(count);
        bw.flush();
    }
}

import java.io.*;
import java.util.*;
//import java.util.stream.*;
//import java.math.*;

public class Main {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        Scanner sc = new Scanner(System.in);
        int p, x;
        long sum = 0;
        int n = sc.nextInt();
        int array[] = new int[n];
        for (int i = 0; i < n; i++) {
            array[i] = sc.nextInt();
            sum += array[i];
        }
        int test = sc.nextInt();
        for (int i = 0; i < test; i++) {
            p = sc.nextInt();
            x = sc.nextInt();
            System.out.println(sum - array[p - 1] + x);
        }
        bw.flush();
    }
}

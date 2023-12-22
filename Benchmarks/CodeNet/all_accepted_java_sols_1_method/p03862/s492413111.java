
import java.io.*;
import java.util.*;
//import java.util.stream.*;
//import java.math.*;

public class Main {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int x = sc.nextInt();
        long sum = 0, diff;
        int array[] = new int[n];
        for (int i = 0; i < n; i++) {
            array[i] = sc.nextInt();
        }
        if (array[0] > x) {
            sum += array[0] - x;
            array[0] -= array[0] - x;
        }
        for (int i = 1; i < n; i++) {
            diff = array[i] + array[i - 1] - x;
            if (diff > 0) {
                sum += diff;
                array[i] -= diff;
            }
        }
        System.out.println(sum);
        bw.flush();
    }
}

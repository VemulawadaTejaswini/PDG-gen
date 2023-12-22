
import java.io.*;
import java.util.*;
//import java.util.stream.*;
//import java.math.*;

public class Main {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        Scanner sc = new Scanner(System.in);
        int w = sc.nextInt();
        int a = sc.nextInt();
        int b = sc.nextInt();
        int x = 0;
        if (b <= (a + w) && b >= a) {
        } else if (a + w < b) {
            x = b - (a + w);
        } else if (b + w < a) {
            x = (b + w) - a;
        }
        System.out.println(Math.abs(x));
        bw.flush();
    }
}

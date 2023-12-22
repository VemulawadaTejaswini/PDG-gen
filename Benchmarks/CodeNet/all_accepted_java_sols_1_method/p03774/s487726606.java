
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
        int m = sc.nextInt();
        int na[][] = new int[n][2];
        int ma[][] = new int[m][2];
        for (int i = 0; i < n; i++) {
            na[i][0] = sc.nextInt();
            na[i][1] = sc.nextInt();
        }
        for (int i = 0; i < m; i++) {
            ma[i][0] = sc.nextInt();
            ma[i][1] = sc.nextInt();
        }
        int pos = -1;
        long min = Integer.MAX_VALUE;
        String s = "";
        for (int i = 0; i < n; i++) {
            pos = -1;
            min = Long.MAX_VALUE;
            for (int j = 0; j < m; j++) {
                long abs = Math.abs((na[i][0] - ma[j][0])) + Math.abs((na[i][1] - ma[j][1]));
                if (abs < min) {
                    min = abs;
                    pos = j + 1;
                }
            }
            s += pos + "\n";
        }
        System.out.println(s);
        bw.flush();
    }
}

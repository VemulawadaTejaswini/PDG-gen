import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] a) throws NumberFormatException, IOException {
        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer strToke;
        String line;
        int num = 0;
        // データ読み込み
        while ((line = in.readLine()) != null && num <= 1000) {
            if (num != 0) {
                strToke = new StringTokenizer(line);
                int b = Integer.parseInt(strToke.nextToken());
                int c = Integer.parseInt(strToke.nextToken());
                int d = Integer.parseInt(strToke.nextToken());
                if (b > c && b > d) {
                    checkTriangle(b, c, d);
                } else if (c > b && c > d) {
                    checkTriangle(c, b, d);
                } else {
                    checkTriangle(d, b, c);
                }
            }
            num++;
        }
    }

    private static void checkTriangle(int aLong, int aShort1, int aShort2) {
        if ((aLong * aLong) == (aShort1 * aShort1 + aShort2 * aShort2)) {
            System.out.println("YES");
        } else {
            System.out.println("NO");
        }
    }
}
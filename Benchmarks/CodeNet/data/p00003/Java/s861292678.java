import java.io.*;

public class Main {
    public static void main(String[] a) throws NumberFormatException, IOException {
        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
        String line;
        int num = 1000;
        while ((line = in.readLine()) != null && (0 < num && num <= 1000)) {
            if (num == 1000) {
                num = Integer.parseInt(line);
            } else {
                int b = Integer.parseInt(line.split(" ")[0]);
                int c = Integer.parseInt(line.split(" ")[1]);
                int d = Integer.parseInt(line.split(" ")[2]);
                if (b > c && b > d) {
                    isRightTriangle(b, c, d);
                } else if (c > b && c > d) {
                    isRightTriangle(c, b, d);
                } else {
                    isRightTriangle(d, b, c);
                }
                num--;
            }
        }
    }

    private static void isRightTriangle(int along, int aShort1, int aShort2) {
        if ((along ^ 2) == (aShort1 ^ 2 + aShort2 ^ 2)) {
            System.out.println("YES");
        } else {
            System.out.println("NO");
        }
    }
}

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = Integer.parseInt(scan.next());
        String s = scan.next();
        scan.close();

        String[] str = s.split("");

        // 累積和
        int[] rR = new int[n + 1];
        int[] gG = new int[n + 1];
        int[] bB = new int[n + 1];
        for (int i = 1; i <= n; i++) {
            if (str[i - 1].equals("R")) {
                rR[i] = rR[i - 1] + 1;
                gG[i] = gG[i - 1];
                bB[i] = bB[i - 1];
            } else if (str[i - 1].equals("G")) {
                rR[i] = rR[i - 1];
                gG[i] = gG[i - 1] + 1;
                bB[i] = bB[i - 1];
            } else {
                rR[i] = rR[i - 1];
                gG[i] = gG[i - 1];
                bB[i] = bB[i - 1] + 1;
            }
        }

        long count = 0;
        for (int i = 0; i < n; i++) {
            String a = str[i];
            for (int j = i + 1; j < n; j++) {
                String b = str[j];
                if (a.equals(b)) {
                    continue;
                }

                String c;
                if (a.equals("R") && b.equals("G")) {
                    c = "B";
                } else if (b.equals("R") && a.equals("G")) {
                    c = "B";
                } else if (a.equals("R") && b.equals("B")) {
                    c = "G";
                } else if (b.equals("R") && a.equals("B")) {
                    c = "G";
                } else {
                    c = "R";
                }

                if (c.equals("R")) {
                    count += rR[n] - rR[j + 1];
                    if (2 * j - i < n && str[2 * j - i].equals("R")) {
                        count--;
                    }
                } else if (c.equals("G")) {
                    count += gG[n] - gG[j + 1];
                    if (2 * j - i < n && str[2 * j - i].equals("G")) {
                        count--;
                    }
                } else {
                    count += bB[n] - bB[j + 1];
                    if (2 * j - i < n && str[2 * j - i].equals("B")) {
                        count--;
                    }
                }

            }
        }

        System.out.println(count);
    }

}

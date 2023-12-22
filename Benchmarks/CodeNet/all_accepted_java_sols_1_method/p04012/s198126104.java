import java.io.PrintWriter;
import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String w = sc.next();
        String[] str = new String[w.length()];
        int count = 2;

        for (int i = 0; i < w.length(); i++) {
            str[i] = w.split("")[i];
        }

        Arrays.sort(str);
        PrintWriter out = new PrintWriter(System.out);

        if (w.length() > 1) {
            if (!str[1].equals(str[0])) {
                out.println("No");
                sc.close();
                out.flush();
                return;
            }
        } else {
            out.println("No");
            sc.close();
            out.flush();
            return;
        }

        for (int i = 2; i < w.length(); i++) {
            if (str[i].equals(str[i - 1])) {
                count++;
            } else {
                if (count % 2 == 0) {
                    count = 1;
                } else {
                    out.println("No");
                    sc.close();
                    out.flush();
                    return;
                }
            }
        }

        if (count % 2 == 0) {
            out.println("Yes");
        } else {
            out.println("No");
            sc.close();
            out.flush();
        }
        sc.close();
        out.flush();
    }
}
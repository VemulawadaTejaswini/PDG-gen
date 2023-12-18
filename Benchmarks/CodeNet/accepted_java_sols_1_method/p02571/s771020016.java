import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String s = scanner.next();
        String t = scanner.next();

        ArrayList<String> aL = new ArrayList<>();

        for (int i = 0; i <= s.length() - t.length(); i++) {
            aL.add(s.substring(i, i + t.length()));
        }

        int ir = 0;

        for (String a : aL) {
            int c = 0;
            for (int i = 0; i < t.length(); i++) {
                if (a.charAt(i) == t.charAt(i)) {
                    c += 1;
                    if (ir > c) {
                      continue;
                    }
                }
                if (ir < c) {
                  ir = c;
                }
            }
        }

        System.out.println(t.length() - ir);
    }
}

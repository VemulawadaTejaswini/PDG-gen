import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int h = sc.nextInt();
        int w = sc.nextInt();
        String[] s = new String[h + 2];
        String tmp = "";
        for (int i = 0; i < w + 2; i++) {
            tmp += ".";
        }
        s[0] = tmp;
        s[s.length - 1] = tmp;
        for (int i = 1; i < s.length - 1; i++) {
            s[i] = "." + sc.next() + ".";
        }
        boolean ok = true;
        for (int i = 1; i < s.length - 1; i++) {
            for (int j = 1; j < s[i].length() - 1; j++) {
                if (s[i].charAt(j) == '#') {
                    if (!(s[i - 1].charAt(j) == '#'
                    || s[i + 1].charAt(j) == '#'
                    || s[i].charAt(j - 1) == '#'
                    || s[i].charAt(j + 1) == '#')) {
                        ok = false;
                    }
                }
            }
        }
        if (ok) {
            System.out.println("Yes");
        } else {
            System.out.println("No");
        }
        sc.close();
    }
}
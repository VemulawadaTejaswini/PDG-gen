import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.next();
        String t = sc.next();
        int res = 10000;
        for (int i = 0; i < s.length() - t.length() + 1; i++) {
            int c = 0;
            for (int j = 0; j < t.length(); j++) {
                if (s.charAt(i + j) != t.charAt(j)) {
                    c++;
                }
            }
            res = Math.min(res, c);
        }
        System.out.println(res);
        sc.close();
    }
}
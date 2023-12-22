import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.next();
        String t = sc.next();
        int n = s.length();

        for (int i = n; i > 0; ) {
            String ss = s.substring(i) + s.substring(0, i);
            if (ss.equals(t)) {
                System.out.println("Yes");
                break;
            } else {
                i = i - 1;
            }
            if (i < 1) {
                System.out.println("No");
            }
        }

    }
}
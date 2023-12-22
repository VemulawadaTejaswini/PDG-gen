import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.next();
        String t = sc.next();

        sc.close();

        if (s.equals(t)) {
            System.out.println("Yes");
            return;
        }
        char[] work = s.toCharArray();

        for (int i = 0; i < work.length - 1; i++) {
            StringBuilder sb = new StringBuilder();
            sb.append(work[work.length - 1]);
            sb.append(s.substring(0, s.length() - 1));
            String txt = sb.toString();
            if (txt.equals(t)) {
                System.out.println("Yes");
                return;
            }
            work = txt.toCharArray();
            s = txt;
        }
        System.out.println("No");
    }
}
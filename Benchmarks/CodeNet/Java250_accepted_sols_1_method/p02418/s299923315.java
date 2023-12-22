import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.next();
        String p = sc.next();
        int end = 0;
        int cnt = 0;
        int j = 0;
        for (int i = 0; i < p.length(); i++) {

            if (s.charAt(j) == p.charAt(i)) {
                cnt++;
                if (cnt == p.length()) {
                    System.out.println("Yes");
                    break;
                }
            }
            j++;
            if (j == s.length()) {
                j = 0;
            }
            if (i == p.length() - 1) {
                i = -1;
                end++;
                j = end;
                cnt = 0;
                if (end == s.length()) {
                    System.out.println("No");
                    break;
                }
            }

        }

    }
}
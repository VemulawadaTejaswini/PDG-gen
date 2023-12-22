import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.next();
        if (str.length() < 8) {
            System.out.println("YES");
        } else {
            char[] c = new char[str.length()];
            int count = 0;
            for (int i = 0; i < str.length(); i++) {
                if (str.charAt(i) == 'o') {
                    count++;
                }
            }
            if (count + (15 - str.length()) < 8) {
                System.out.println("NO");
            } else {
                System.out.println("YES");
            }
        }

    }
}

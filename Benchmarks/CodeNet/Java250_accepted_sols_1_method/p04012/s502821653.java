import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String w = sc.next();
        for (char c = 'a'; c <= 'z'; c++) {
            int count = 0;
            for (int i = 0; i < w.length(); i++) {
                if (c == w.charAt(i))
                    count++;
            }
            if (count % 2 != 0) {
                System.out.println("No");
                System.exit(0);
            }
        }
        System.out.println("Yes");
    }
}

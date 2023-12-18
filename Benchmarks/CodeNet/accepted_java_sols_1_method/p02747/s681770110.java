import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.next();
        String hi = "hi";
        if (str.length() % 2 == 1) {
            System.out.println("No");
            return;
        }

        for (int i = 0; i < str.length(); i += 2) {
            if (!str.substring(i, i + 2).equals(hi)) {
                System.out.println("No");
                return;
            }
        }

        System.out.println("Yes");
    }
}
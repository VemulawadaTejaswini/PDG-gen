import java.util.*;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.next();

        boolean res = true;
        int indexC = 0;

        if (s.charAt(0) != 'A') {
            res = false;
            System.out.println("WA");
            return;
        }

        boolean hasC = false;
        for (int i = 2; i <= s.length() - 2; i++) {
            if (s.charAt(i) == 'C') {
                hasC = true;
                indexC = i;
                break;
            }
        }

        res = hasC ? true : false;
        if (!res) {
            System.out.println("WA");
            return;
        }

        for (int i = 0; i < s.length(); i++) {
            if (i == 0 || i == indexC) continue;

            if (!Character.isLowerCase(s.charAt(i))) {
                res = false;
                break;
            }
        }

        System.out.println(res ? "AC" : "WA");
    }
}

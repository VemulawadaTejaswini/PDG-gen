import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String s = sc.next();

        int length = s.length();

        String ans = "";

        for (int i = 0; i < length; i++) {
            ans = ans + "x";
        }

        System.out.println(ans);
    }
}
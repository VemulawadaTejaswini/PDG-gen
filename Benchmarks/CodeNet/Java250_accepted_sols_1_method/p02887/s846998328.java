import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        long N = Long.parseLong(sc.nextLine());
        String S = sc.nextLine();
        sc.close();

        char baseChar = "*".toCharArray()[0];
        long count = 0;

        for (int i = 0; i < S.length(); i++) {
            char s = S.charAt(i);
            if (baseChar != s) {
                baseChar = s;
                count++;
            }
        }

        System.out.println(count);
    }

}
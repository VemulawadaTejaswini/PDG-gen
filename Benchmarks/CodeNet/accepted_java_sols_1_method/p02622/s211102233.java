import java.util.*;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String s = scanner.next();
        String t = scanner.next();

        int sum = 0;
        for (int i = 0; i < s.length(); i++) {
            char sc = s.charAt(i);
            char tc = t.charAt(i);
            if (sc != tc) {
                sum++;
            }
        }

        System.out.println(sum);

    }

}
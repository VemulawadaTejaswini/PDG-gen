import java.util.*;

public class Main {

    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        int N = sc.nextInt();
        String str = sc.next();

        int red = 0;
        int blue = 0;
        char[] chars = str.toCharArray();
        for (int i = 0; i < chars.length; i++) {
            if (chars[i] == 'R') {
                red++;
            }
            if (chars[i] == 'B') {
                blue++;
            }
        }

        System.out.println((red > blue) ? "Yes" : "No");
    }
}
import java.util.*;

public class Main {
    public static String mainString;
    public static String subString;
    public static int maxLength = 0;
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        mainString = sc.nextLine();
        subString = sc.nextLine();

        for (int i = 0; i <= mainString.length() - subString.length(); i++) {
            loop(i);
        }

        System.out.println(subString.length() - maxLength);
    }

    public static void loop(int start) {
        String ms = mainString.substring(start, start + subString.length());
        check(ms);
    }

    public static void check(String ms) {
        int count = 0;
        for (int i = 0; i < subString.length(); i++) {
            if (ms.charAt(i) == subString.charAt(i)) {
                count++;
            }
        }
        if (maxLength < count) {
            maxLength = count;
        }
    }
}
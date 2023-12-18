import java.util.*;

public class Main {
    private static Scanner sc;

    public static void main(String[] args) {
        sc = new Scanner(System.in);
        // 整数の入力
        String a = sc.nextLine();
        char b = a.charAt(a.length() - 1);
        String c;

        if (b == 's') {
            c = a + "es";
        } else {
            c = a + "s";
        }

        // 出力
        System.out.println(c);
    }
}
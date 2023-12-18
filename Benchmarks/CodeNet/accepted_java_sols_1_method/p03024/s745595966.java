import java.util.*;

public class Main {

    private static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {

        String s = sc.next();

        int x = 0;
        for (char ch : s.toCharArray()) {
            if (ch == 'x')
                x++;
        }

        System.out.println(x >= 8 ? "NO" : "YES");

    }


}

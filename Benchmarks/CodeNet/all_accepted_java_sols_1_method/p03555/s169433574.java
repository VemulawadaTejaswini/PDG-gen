import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String s = scanner.next();
        String t = scanner.next();

        for (int i = 0; i < 3; i++) {
            t = t.substring(2, 3) + t.substring(1, 2) + t.substring(0, 1);
        }

        String judge = "NO";
        if (s.equals(t)) {
            judge = "YES";
        }
        System.out.println(judge);
    }

}

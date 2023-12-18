import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String t = sc.next();
        for (int i = 0; i < t.length(); i++) {
            char c = t.charAt(i);
            if (c == '?') {
                System.out.print('D');
            } else {
                System.out.print(c);
            }
        }

    }
}
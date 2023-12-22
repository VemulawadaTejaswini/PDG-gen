import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String s = scanner.next();
        while (!s.equals("-")) {
            int m = scanner.nextInt();
            for (int i = 0; i < m; i++) {
                int h = scanner.nextInt();
                String s1 = s.substring(0, h);
                String s2 = s.substring(h);
                s = s2 + s1;
            }
            System.out.println(s);
            s = scanner.next();
        }
    }
}

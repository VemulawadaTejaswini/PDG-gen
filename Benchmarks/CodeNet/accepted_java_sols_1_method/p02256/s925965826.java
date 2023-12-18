import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();
        int b = scanner.nextInt();
        int x = Math.max(a, b);
        int y = Math.min(a, b);
        LOOP: while(true) {
            int r = x % y;
            x = y;
            y = r;
            if (r == 0) {
              System.out.println(x);
              break LOOP;
            }
        }
    }
}


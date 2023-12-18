import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        for (int i = 1; ; ++i) {
            int x = in.nextInt();
            if (x == 0) break;
            System.out.println("Case " + i + ": " + x);
        }
    }
}

import java.util.Scanner;

public class Main {

    static Scanner sc = new Scanner(System.in);
    static int n;
    static int m;
    static int x;

    public static void main(String[] args) {
        n = sc.nextInt();
        m = sc.nextInt();
        x = sc.nextInt();
        int before = 0;
        int after = 0;
        for (int i = 0; i < m; i++) {
            int ai = sc.nextInt();
            if (ai < x) {
                before++;
            } else {
                after++;
            }

        }
        System.out.println(Math.min(before, after));
    }

}

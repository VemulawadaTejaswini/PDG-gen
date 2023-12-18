
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int h1, h2, m1, m2, k;
        h1 = sc.nextInt();
        m1 = sc.nextInt();
        h2 = sc.nextInt();
        m2 = sc.nextInt();
        k = sc.nextInt();

        int start, end;
        start = 60 * h1 + m1;
        end = 60 * h2 + m2;
        int ans = (end - start) - k;

        System.out.println(ans);
    }
}

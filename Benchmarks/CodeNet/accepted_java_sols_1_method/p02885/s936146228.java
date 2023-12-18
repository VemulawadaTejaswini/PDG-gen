import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int A = Integer.parseInt(sc.next());
        int B = Integer.parseInt(sc.next());
        sc.close();

        int ans = 0;
        if (A < 2 * B) {
            System.out.println(ans);
        } else {
            System.out.println(A - 2 * B);
        }
    }
}

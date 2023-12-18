import java.util.Scanner;

public class Main {

    public static final int MOD = 1000000007;

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int d = Integer.parseInt(sc.next());
        int t = Integer.parseInt(sc.next());
        int s = Integer.parseInt(sc.next());
        if (d <= t * s) {
            System.out.println("Yes");
        } else {
            System.out.println("No");
        }
    }
}
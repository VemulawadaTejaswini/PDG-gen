import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int h = Integer.parseInt(sc.next());
        int w = Integer.parseInt(sc.next());
        int n = Integer.parseInt(sc.next());
        int m = Math.max(h, w);
        if (n % m == 0) {
            System.out.println(n / m);
        } else {
            System.out.println((n / m) + 1);
        }
    }
}

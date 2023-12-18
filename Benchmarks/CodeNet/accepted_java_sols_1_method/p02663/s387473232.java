import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int h1 = Integer.parseInt(sc.next());
        int m1 = Integer.parseInt(sc.next());
        int h2 = Integer.parseInt(sc.next());
        int m2 = Integer.parseInt(sc.next());
        int k = Integer.parseInt(sc.next());
        System.out.println(Math.max((h2 * 60 + m2) - (h1 * 60 + m1) - k, 0));
    }
}

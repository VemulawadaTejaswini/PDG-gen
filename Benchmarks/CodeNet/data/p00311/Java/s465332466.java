import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int h1 = sc.nextInt(), h2 = sc.nextInt();
        int k1 = sc.nextInt(), k2 = sc.nextInt();
        int a = sc.nextInt(), b = sc.nextInt(), c = sc.nextInt(), d = sc.nextInt();
        int p1 = h1 * a + h2 * b + h1 / 10 * c + h2 / 20 * d;
        int p2 = k1 * a + k2 * b + k1 / 10 * c + k2 / 20 * d;
        if(p1 == p2) {
            System.out.println("even");
        } else if(p1 > p2) {
            System.out.println("hiroshi");
        } else {
            System.out.println("kenjiro");
        }
    }
}


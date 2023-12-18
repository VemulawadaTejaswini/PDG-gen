import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        @SuppressWarnings("resource")
        Scanner sc = new Scanner(System.in);
        long a = sc.nextLong();
        long v = sc.nextLong();
        long b = sc.nextLong();
        long w = sc.nextLong();
        long t = sc.nextLong();
        if (v <= w) {
            System.out.println("NO");
        } else {
            if (Math.abs(v - w) * t >= Math.abs(a - b)) {
                System.out.println("YES");
            } else {
                System.out.println("NO");
            }
        }
    }

}
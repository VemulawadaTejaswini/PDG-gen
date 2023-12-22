import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        long x = sc.nextLong();
        long a = sc.nextLong();
        long b = sc.nextLong();

        if (a - b >= 0) {
            System.out.println("delicious");
            return;
        }
        if (b - a <= x) {
            System.out.println("safe");
            return;
        }
        System.out.println("dangerous");
    }

}

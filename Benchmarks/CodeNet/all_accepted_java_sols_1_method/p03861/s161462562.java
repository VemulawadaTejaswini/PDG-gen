import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        long a = sc.nextLong();
        long b = sc.nextLong();
        long x = sc.nextLong();

        long b2 = b / x + 1;
        long a2 = (a - 1) / x + 1;
        if (a == 0) a2 = 0;
        System.out.println(b2 - a2);
    }
}

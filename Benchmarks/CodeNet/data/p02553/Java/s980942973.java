import java.util.*;

public class Main {

    Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        new Main().run();
    }

    void run() {

        long a = sc.nextLong();
        long b = sc.nextLong();
        long c = sc.nextLong();
        long d = sc.nextLong();

        long max = a * c;
        max = Math.max(max, a * d);
        max = Math.max(max, b * c);
        max = Math.max(max, b * d);

        System.out.print(max);
    }


}


import java.util.*;

class Main {
    final Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        new Main().run();
    }

    private void run() {
        long a = sc.nextLong();
        double b = sc.nextDouble();
        System.out.println((long)Math.floor(a*b));

    }
}


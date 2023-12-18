import java.util.*;

public class Main {

    Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        new Main().run();
    }

    void run() {

        int n = sc.nextInt();
        int d = sc.nextInt();
        int x = sc.nextInt();

        int cnt = (n % d == 0) ? n / d : n / d + 1;

        System.out.println(cnt * x);

    }


}


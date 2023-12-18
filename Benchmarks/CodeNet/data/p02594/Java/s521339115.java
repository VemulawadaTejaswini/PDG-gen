import java.util.*;

public class Main {

    Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        new Main().run();
    }

    void run() {

        int n = sc.nextInt();

        if (30 <= n) {
            System.out.print("Yes");
        } else {
            System.out.print("No");
        }
    }

}


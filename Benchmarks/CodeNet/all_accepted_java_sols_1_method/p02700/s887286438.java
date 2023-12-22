import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        long A = sc.nextLong();
        long B = sc.nextLong();
        long C = sc.nextLong();
        long D = sc.nextLong();
        sc.close();

        long i = 0;
        for (i = 1;; i++) {
            if (C - B * i <= 0 || A - D * i <= 0)
                break;
        }

        if (C - B * i <= 0) {
            System.out.println("Yes");
        } else {
            System.out.println("No");
        }
    }
}
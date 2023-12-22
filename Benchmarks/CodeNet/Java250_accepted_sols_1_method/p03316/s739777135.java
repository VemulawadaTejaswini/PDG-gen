import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        int s = 0;
        int tmp = n;
        for (int i = 0; i < 10; i++) {
            s += tmp % 10;
            tmp /= 10;
        }

        if (n % s == 0) {
            System.out.println("Yes");
        } else {
            System.out.println("No");
        }

        sc.close();
    }

}

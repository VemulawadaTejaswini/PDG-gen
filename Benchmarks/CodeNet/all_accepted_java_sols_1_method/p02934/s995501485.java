import java.util.Scanner;


// 138_a
public class Main {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        int n = scan.nextInt();

        double tmp = 0.0;
        for (int i = 0; i < n; i++) {
            tmp += 1.0 / scan.nextDouble();
        }

        System.out.println(1.0 / tmp);

    }

}

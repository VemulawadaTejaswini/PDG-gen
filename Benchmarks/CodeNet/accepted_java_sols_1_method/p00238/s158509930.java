
import java.util.Scanner;

class Main {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int t = scan.nextInt();
        while (t > 0) {
            int n = scan.nextInt();
            int s;
            int f;
            int sum = 0;
            for (int i = 0; i < n; i++) {
                s = scan.nextInt();
                f = scan.nextInt();
                sum += f - s;
            }

            if (t <= sum) {
                System.out.println("OK");
            } else {
                System.out.println(t - sum);
            }
            t = scan.nextInt();
        }
    }
}


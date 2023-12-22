import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int d = sc.nextInt();
        int cnt = 0;
        for (int i = 0; i < n; i++) {
            double x = sc.nextDouble();
            double y = sc.nextDouble();
            if (Math.sqrt(x * x + y * y) <= d) {
                cnt++;
            }
        }
        System.out.println(cnt);
    }

}

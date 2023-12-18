import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();
        int k = sc.nextInt();
        sc.close();

        int sum = 0;
        if (a >= k) {
            sum = k;
        } else if ((a + b) >= k) {
            sum = a;
        } else {
            sum = a - (k - a - b);
        }

        System.out.println(sum);

        return;
    }
}

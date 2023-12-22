import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        if (n % 2 == 0) {
            System.out.println(0.5000000000);
        } else {
            double result = (double)(n + 1) / (2 * n);
            System.out.println(result);
        }
        sc.close();
    }
}
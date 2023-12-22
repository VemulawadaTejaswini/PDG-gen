import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int t = sc.nextInt();

        int sum = 0;

        for (int i = 1; i < t + 1; i++) {
            if (i % a == 0) {
                sum += b;
            }
        }

        System.out.println(sum);
    }
}
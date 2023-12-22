import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while (sc.hasNext()) {
            int a = sc.nextInt();
            int b = sc.nextInt();
            int c = sc.nextInt();
            int sum = 0;
            a %= b;
            while (c-- > 0) {
                sum += a * 10 / b;
                a = a * 10 % b;
            }
            System.out.println(sum);
        }
    }
}

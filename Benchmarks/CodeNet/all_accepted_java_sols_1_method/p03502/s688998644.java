import java.util.Scanner;

public class Main {
    public static void main(String [] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int tmp = n;
        long sum = 0;
        while (n > 0) {
            sum += n % 10;
            n /= 10;
        }

        if (tmp % sum == 0) {
            System.out.println("Yes");
        } else {
            System.out.println("No");
        }
    }

}

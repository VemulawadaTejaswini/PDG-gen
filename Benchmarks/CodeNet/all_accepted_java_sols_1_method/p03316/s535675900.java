import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int originalN = sc.nextInt();
        int n = originalN;
        int sum = 0;

        while (n > 0) {
            sum = sum + n % 10;
            n = n / 10;
        }
        if (originalN % sum > 0) {
            System.out.println("No");
        } else {
            System.out.println("Yes");
        }

    }
}
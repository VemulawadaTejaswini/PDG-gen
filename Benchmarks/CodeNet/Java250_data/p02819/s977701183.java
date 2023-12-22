import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int X = sc.nextInt();

        for (int i = X; i < X * 2; i++)
            if (isPrime(i)) {
                System.out.println(i);
                return;
            }

    }

    static boolean isPrime(int num) {
        if (num == 1 || num == 2) return true;
        if (num % 2 == 0) return false;

        for (int i = 3; i < Math.sqrt(num); i += 2)
            if (num % i == 0) return false;

        return true;
    }
}

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = scanner.nextInt();
        int oddCount;
        if (n % 2 == 0)
            oddCount = n / 2;
        else
            oddCount = (n + 1) / 2;

        System.out.println((float) oddCount / n);
    }
}

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String[] params = scanner.nextLine().split(" ");
        int a = Integer.parseInt(params[0]);
        int b = Integer.parseInt(params[1]);
        int[] results = {a + b, a - b, a * b};
        int max = -9999999;
        for (int n: results) {
            if (n > max) max = n;
        }
        scanner.close();
        System.out.println(max);
    }
}
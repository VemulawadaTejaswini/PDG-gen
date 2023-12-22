import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int sum = sc.nextInt();

        int count = 0;
        int min = Integer.MAX_VALUE;
        for (int i = 0; i < n; i++) {
            int value = sc.nextInt();
            sum -= value;
            min = Math.min(value, min);
            count++;
        }

        count += (sum / min);

        System.out.print(count);
    }
}

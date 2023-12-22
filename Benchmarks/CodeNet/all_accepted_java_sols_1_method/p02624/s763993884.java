import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        long sum = 0;
        for (int i = 1; i <= n; i++) {
            long y = n / i;
            sum += y * (y + 1) * i / 2;
        }
        System.out.println(sum);
        sc.close(); 
    }
}
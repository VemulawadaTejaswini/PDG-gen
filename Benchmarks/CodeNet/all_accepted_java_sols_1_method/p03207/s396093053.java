import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int total = 0;
        int price;
        int mx = -1;
        for (int i = 0; i < n; i++) {
            price = sc.nextInt();
            if (mx < price) {
                mx = price;
            }
            total += price;
        }
        total -= (mx >> 1);
        System.out.println(total);
        sc.close();
    }
}

import java.util.*;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        double total = 0.0;
        for(int i = 0; i < n; i++) {
            double amount = sc.nextDouble();
            String currency = sc.next();
            if(currency.equals("JPY")) {
                total += amount;
            } else {
                total += (amount * 380000.0);
            }
        }
        System.out.println(total);
    }
}
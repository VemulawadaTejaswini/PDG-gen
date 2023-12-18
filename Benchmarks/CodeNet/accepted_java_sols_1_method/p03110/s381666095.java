import java.util.*;
public class Main {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        double sum = 0;
        int num = sc.nextInt();

        for (int i = 0; i < num; i++) {
            double amount = sc.nextDouble();
            String unit = sc.next();
            if (unit.equals("BTC")) {
                sum += amount * 380000.0;
            } else {
                sum += amount;
            }
        }
        System.out.println(sum);
    }
}
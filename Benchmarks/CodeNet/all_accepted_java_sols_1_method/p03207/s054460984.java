import java.util.*;

public class Main {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        int quantity = sc.nextInt();
        int[] prices = new int[quantity];
        for(int i = 0; i<quantity; i++){
            prices[i] = sc.nextInt();
        }
        Arrays.sort(prices);
        int total = 0;
        for(int i = 0; i<quantity; i++){
            int price = i == quantity - 1 ? prices[i] / 2 : prices[i];
            total += price;
        }
        System.out.println(total);
    }
}

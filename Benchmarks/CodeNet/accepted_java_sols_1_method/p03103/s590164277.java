import java.util.*;
import java.io.*;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int m = in.nextInt();
        Map<Integer, Integer> stores = new TreeMap<>();
        for (int i = 0; i < n; i++) {
            int price = in.nextInt();
            int quant = in.nextInt();
            stores.put(price, stores.getOrDefault(price, 0) + quant);
        }
        long yen = 0;
        for (int price : stores.keySet()) {
            while (stores.get(price) > 0) {
                m--;
                stores.put(price, stores.get(price) - 1);
                yen += price;
                if (m == 0) {
                    System.out.println(yen);
                    return;
                }
            }
        }
        System.out.println("?");
    }
}

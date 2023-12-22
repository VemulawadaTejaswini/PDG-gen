
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String str1 = scanner.nextLine();
        String str2 = scanner.nextLine();
        int price = 0;
        List<Integer> prices = new ArrayList<>();
        int N = Integer.parseInt(str1.split(" ")[0]);
        int K = Integer.parseInt(str1.split(" ")[1]);
        for(String s : str2.split(" ")){
            prices.add(Integer.parseInt(s));
        }
        Collections.sort(prices);
        for (int i = 0; i < K; i++) {
            price += prices.get(i);
        }
        System.out.println(price);
    }
}
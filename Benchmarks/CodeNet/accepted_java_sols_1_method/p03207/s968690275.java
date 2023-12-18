import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        List<Integer> prices = new ArrayList<>();
        for (int i = 0; i < n; i++) prices.add(sc.nextInt());

        int mostExpensive = prices.stream().mapToInt(v -> v).max().getAsInt() / 2;

        int result = 0;
        for (int i = 0; i < n; i++) {
            result += prices.get(i);
        }
        System.out.println(result - mostExpensive);
    }
}
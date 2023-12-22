import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();

        List<Integer> values = new ArrayList<Integer>();
        for (int i = 0; i < N; i++) {
            values.add(sc.nextInt());
        }

        List<Integer> costs = new ArrayList<Integer>();
        for (int i = 0; i < N; i++) {
            costs.add(sc.nextInt());
        }

        int max = 0;
        for (int i = 0; i < N; i++) {
            int profit = values.get(i) - costs.get(i);
            if (profit > 0) {
                max += profit;
            }
        }

        System.out.println(max);
    }
}
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        Integer jewel = Integer.parseInt(sc.nextLine()); // not use count

        String[] value = sc.nextLine().split(" ");
        String[] costs = sc.nextLine().split(" ");

        List<Integer> amount = new ArrayList<>();

        int limit = value.length;
        for (int i = 0; i < limit; i++) {
            int v = Integer.parseInt(value[i]);
            int c = Integer.parseInt(costs[i]);

            if (v > c) {
                // using value as over cost
                amount.add(v - c);
            }
        }

        int total = amount.stream().reduce(0, (s1, s2) -> s1 + s2);
        System.out.println(total);
    }
}

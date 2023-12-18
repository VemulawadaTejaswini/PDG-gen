import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

class Main {

    private static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        int n = sc.nextInt(), m = sc.nextInt(), x = sc.nextInt();
        List<Integer> c = new ArrayList<>();
        for (int i = 0; i < m; i++) {
            c.add(sc.nextInt());
        }
        int cost1 = 0, cost2 = 0, current = x;
        while (current != 0) {
            if (c.contains(current - 1)) {
                cost1++;
            }
            current--;
        }
        current = x;
        while (current != n) {
            if (c.contains(current + 1)) {
                cost2++;
            }
            current++;
        }
        System.out.println(Math.min(cost1, cost2));
    }
}
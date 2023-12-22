import java.util.*;

public class Main {
    public static void main(final String[] args) {
        Scanner sc = new Scanner(System.in);
        int n =sc.nextInt();
        List<int[]> list = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            list.add(new int[]{sc.nextInt(), sc.nextInt()});
        }
        list.sort(Comparator.comparingInt(e -> e[1]));
        int cur = 0;
        for (int[] e: list) {
            int deadline = e[1];
            cur += e[0];
            if (cur > deadline) {
                System.out.println("No");
                return;
            }
        }
        System.out.println("Yes");
    }
}
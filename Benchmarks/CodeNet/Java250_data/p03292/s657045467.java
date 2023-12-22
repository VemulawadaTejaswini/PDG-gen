import java.util.*;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] a = new int[]{sc.nextInt(), sc.nextInt(), sc.nextInt()};

        // 昇順に並び替え
        Arrays.sort(a);

        int cost = 0;
        cost += a[1] - a[0];
        cost += a[2] - a[1];

        System.out.println(cost);
    }
}

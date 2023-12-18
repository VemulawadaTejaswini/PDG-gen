import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.Scanner;

public class Main {

    public static final int MOD = 1000000007;

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = Integer.parseInt(sc.next());
        List<Integer> list = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            int temp = Integer.parseInt(sc.next());
            list.add(temp);
            list.add(temp);
        }
        Collections.sort(list, Comparator.reverseOrder());
        long ans = 0;
        for (int i = 1; i < n; i++) {
            ans += list.get(i);
        }
        System.out.println(ans);
    }
}
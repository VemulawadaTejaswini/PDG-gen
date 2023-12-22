
import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        List<Long> list = new ArrayList<>();
        int n  = sc.nextInt();

        for (int i = 0; i < n; i++) {
            list.add(sc.nextLong());
        }
        List<Long> ans = new ArrayList<>(list);
        Collections.sort(list);

        long high, low;
        high = list.get((n / 2));
        low = list.get((n / 2) - 1);

        for (long num : ans){
            System.out.println( num < high ? high : low);
        }

    }
}

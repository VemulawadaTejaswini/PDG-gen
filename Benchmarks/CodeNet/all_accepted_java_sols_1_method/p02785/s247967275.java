import java.util.*;

public class Main {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int k = sc.nextInt();

        if (k > n) {
            k = n;
        }

        List<Long> h = new ArrayList<>(n);
        for (int i = 0; i < n; i++) {
            h.add(sc.nextLong());
        }

        h.sort(Long::compareTo);

        for (int i = 0; i < k; i++) {
            h.remove(h.size() - 1);
        }

        long result = 0;
        for (Long aLong : h) {
            result += aLong;
        }

        System.out.println(result);
    }
}
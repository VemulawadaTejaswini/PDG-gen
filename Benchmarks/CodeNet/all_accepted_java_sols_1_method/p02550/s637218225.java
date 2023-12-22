import java.util.*;

public class Main {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        long n = scan.nextLong();
        long x = scan.nextLong();
        long m = scan.nextLong();
        x = x % m;
        Map<Long, Integer> M = new HashMap<>();
        List<Long> list = new ArrayList<>();
        M.put(x, 0);
        list.add(x);
        int i = 1;
        for (; i < n; i++) {
            x = x * x % m;
            if (M.containsKey(x)) break;
            M.put(x, i);
            list.add(x);
        }
        if (i == n) {
            long sum = 0;
            for (int j = 0; j < list.size(); j++) sum = sum + list.get(j);
            System.out.println(sum);
            return;
        }
        long ans = 0;
        int pos = M.get(x);
        for (i = 0; i < pos; i++) ans += list.get(i);
        n -= pos;
        int len = list.size() - pos;
        long sum = 0;
        for (int j = pos; j < list.size(); j++) sum = sum + list.get(j);
        long cnt = n / len;
        ans += sum * cnt;
        n %= len;
        for (i = 0; i < n; i++) {
            ans += list.get(pos + i);
        }
        System.out.println(ans);
    }
}

import java.util.*;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int m = sc.nextInt();
        long[] h = new long[n];
        for (int i = 0; i < n; i++) {
            h[i] = sc.nextLong();
        }
        List<TreeSet<Long>> list = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            list.add(new TreeSet<>(Collections.reverseOrder()));
        }
        for (int i = 0; i < m; i++) {
            int a = sc.nextInt() -1;
            int b = sc.nextInt() -1;
            list.get(a).add(h[b]);
            list.get(b).add(h[a]);
        }

        int count = 0;
        for (int i = 0; i < n; i++) {
            Set<Long> tmp = list.get(i);
            if (tmp.isEmpty()){
                count++;
                continue;
            }

            for (Long t : tmp){
                if (h[i] > t) {
                    count++;
                }
                break;
            }
        }

        System.out.println(count);
    }
}
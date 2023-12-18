import java.util.*;

public class Main {

    public static void main(String args[]) {

        // 入力
        Scanner sc = new Scanner(System.in);
        int n = Integer.parseInt(sc.next());
        long[] a = new long[n];
        int[] count = new int[100001];
        for (int i = 0; i < n; i++) {
            int num = Integer.parseInt(sc.next());
            a[i] = num;
            count[num]++;
        }
        int q = Integer.parseInt(sc.next());
        List<String> list = new ArrayList<>();
        long sum = Arrays.stream(a).sum();
        for (int i = 0; i < q; i++) {
            int b = Integer.parseInt(sc.next());
            int c = Integer.parseInt(sc.next());
            long diff = (long) (c - b) * count[b];
            count[c] += count[b];
            count[b] = 0;
            sum += diff;
            list.add(Long.toString(sum));
        }
        sc.close();

        String result = String.join("\r\n", list);

        // 出力
        System.out.println(result);
    }
}

import java.util.*;

public class Main {

    public static void main(String args[]) {

        // 入力
        Scanner sc = new Scanner(System.in);
        int n = Integer.parseInt(sc.next());
        String[] s = new String[n];
        for (int i = 0; i < n; i++) {
            s[i] = sc.next();
        }

        // 主処理
        long[] count = new long[5];
        for (int i = 0; i < s.length; i++) {
            if (s[i].startsWith("M")) {
                count[0]++;
            } else if (s[i].startsWith("A")) {
                count[1]++;
            } else if (s[i].startsWith("R")) {
                count[2]++;
            } else if (s[i].startsWith("C")) {
                count[3]++;
            } else if (s[i].startsWith("H")) {
                count[4]++;
            }
        }

        long[] array = Arrays.stream(count).filter(c -> 0 < c).toArray();
        long result = 0;

        if (3 <= array.length) {
            List<Long> list = new ArrayList<>();
            for (int i = 0; i < array.length; i++) {
                for (int j = i + 1; j < array.length; j++) {
                    for (int k = j + 1; k < array.length; k++) {
                        long num = array[i] * array[j] * array[k];
                        list.add(num);
                    }
                }
            }
            result = list.stream().mapToLong(c -> c).sum();
        }

        // 出力
        System.out.println(result);
        sc.close();
    }
}

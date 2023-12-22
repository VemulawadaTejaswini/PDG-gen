import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = Integer.parseInt(sc.next());
        long res = 0;
        Map<String, Integer> map = new HashMap<>();
        for (int i = 0; i < N; i++) {
            char[] c = sc.next().toCharArray();
            Arrays.sort(c);
            String s = String.valueOf(c);
            int tmp = map.getOrDefault(s, 0);
            res += tmp;
            map.put(s, tmp + 1);
        }

        System.out.println(res);
    }
}

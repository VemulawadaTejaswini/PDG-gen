
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        Map<Long, Integer> has1 = new HashMap<>();
        Map<Long, Integer> has2 = new HashMap<>();
        long ans = 0;
        for (int i = 0; i < n; i++) {
            String s = scanner.next();
            int[] cnt = new int[26];
            for (int j = 0; j < s.length(); j++) {
                cnt[s.charAt(j) - 97]++;
            }
            long v = 0;
            for (int j = s.length() - 1; j >= 0; j--) {
                if (j >= 1) {
                    for (int k = 0; k < 26; k++) {
                        if (cnt[k] > 0) {
                            ans = ans + has2.getOrDefault(v * 27 + k + 1, 0);
                            int tmp = has1.getOrDefault(v * 27 + k + 1, 0);
                            has1.put(v * 27 + k + 1, tmp + 1);
                        }
                    }
                }
                v = v * 27 + s.charAt(j) - 97 + 1;
                cnt[s.charAt(j) - 97]--;
            }
            ans = ans + has1.getOrDefault(v, 0);
            int tmp = has2.getOrDefault(v, 0);
            has2.put(v, tmp + 1);
//            System.out.println(ans);
        }
        System.out.println(ans);
    }
}
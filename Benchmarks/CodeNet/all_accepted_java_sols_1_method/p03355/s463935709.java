import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.Scanner;
import java.util.Set;

class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.next();
        int k = sc.nextInt();
        Set<String> set = new HashSet<>();
        int len = s.length();
        // i : start数
        for (int i = 0; i < len; i++) {
            for (int j = 1; j <= k; j++) {
                if (i + j > len) {
                    continue;
                }
                String tmp = s.substring(i, i + j);
                set.add(tmp);
            }
        }
        List<String> str = new ArrayList<>(set);
        Collections.sort(str);
        System.out.println(str.get(k - 1));
        sc.close();
    }
}

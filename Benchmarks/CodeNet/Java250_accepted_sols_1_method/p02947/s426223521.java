import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        String[] s = new String[n];
        long count = 0;
        for (int i = 0; i < n; i++) {
            s[i] = sc.next();
            char[] c = s[i].toCharArray();
            Arrays.sort(c);
            s[i] = "";
            for (int j = 0; j < c.length; j++) {
                s[i] += String.valueOf(c[j]);
            }
        }
        Arrays.sort(s);
        Map<String, Long> map = new HashMap<>();
        for (int i = 0; i < n; i++) {
            if (map.containsKey(s[i])) {
                map.put(s[i], map.get(s[i]) + 1);
            } else {
                map.put(s[i], (long) 1);
            }
        }
        for (long i : map.values()) {
            count += i * (i - 1) / 2;
        }
        System.out.println(count);
    }
}

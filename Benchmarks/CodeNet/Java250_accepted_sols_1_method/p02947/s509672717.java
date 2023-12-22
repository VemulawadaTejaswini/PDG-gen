

import java.util.Arrays;
import java.util.HashMap;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        long ans = 0;
        int FirstPutValue = 1;
        HashMap<String, Integer> map = new HashMap<String, Integer>();

        for (int i = 0; i < n; i++ ) {
            String s = sc.next();
            char[] chars = s.toCharArray();
            Arrays.sort(chars);
            String key = new String(chars);

            if (map.containsKey(key)) {
                int value = map.get(key);
                ans += value;
                map.put(key, value + 1);
            } else {
                map.put(key, FirstPutValue);
            }
        }

        System.out.println(ans);

        sc.close();
    }
}
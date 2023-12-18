import java.io.IOException;

import java.io.BufferedReader;
import java.io.InputStreamReader;

import java.util.HashMap;

public class Main {
    public static void main(String[] args) throws IOException {
        try (
            BufferedReader reader = new BufferedReader(
                new InputStreamReader(System.in))) {
            final String s = reader.readLine();
            final String[] sl = s.split(" ");

            HashMap<Integer, Integer> hm = new HashMap<Integer, Integer>();

            for (int i = 0; i < sl.length; i++) {
                int k = Integer.parseInt(sl[i]);
                if (hm.containsKey(k)) {
                    hm.put(k, hm.get(k) + 1);
                } else {
                    hm.put(k, 1);
                }
            }

            String ans = "NO";
            if (hm.containsKey(5) && hm.containsKey(7)
                && hm.get(5) == 2 && hm.get(7) == 1) ans = "YES";

            System.out.println(ans);
        }
    }
}

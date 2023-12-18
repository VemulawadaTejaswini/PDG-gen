import java.io.*;
import java.util.*;

/**
 * Created by Ayushi on 16 Feb 2020.
 * Problem:
 * Round:
 */

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String temp = br.readLine();
        int n = Integer.parseInt(temp);
        String[] ans = new String[n];
        int a = 0;
        int m = 1;
        HashMap<String, Integer> hmap = new HashMap<>();
        hmap.put("", 0);
        for (int i = 0; i < n; i++) {
            temp = br.readLine();

            if (hmap.containsKey(temp)) {
                hmap.replace(temp, hmap.get(temp)+1);
                m = Math.max(m, hmap.get(temp));
                ans[i] = "";
            }
            else {
                hmap.put(temp, 1);
                ans[i] = temp;
                a++;
            }
        }
        br.close();

        Arrays.sort(ans);
        for (int j = n-a; j < n; j++) {
            if (hmap.get(ans[j]) != m) {
                ans[j] = "";
            }
        }
        Arrays.sort(ans);
        for (int k = 0; k < n; k++) {
            if (!(ans[k].equals(""))) System.out.println(ans[k]);
        }
    }
}

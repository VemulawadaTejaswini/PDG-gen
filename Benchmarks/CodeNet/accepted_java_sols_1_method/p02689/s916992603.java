import java.io.*;
import java.util.*;

/**
 * Created by Ayushi on 03 May 2020.
 * Problem:
 * Round:
 */

public class Main {
    public static void main(String[] args) throws IOException {
        StringTokenizer st;
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        st = new StringTokenizer(br.readLine());
        int n = Integer.parseInt(st.nextToken());
        int m = Integer.parseInt(st.nextToken());
        st = new StringTokenizer(br.readLine());
        int[] h = new int[n];
        HashMap<Integer, ArrayList<Integer>> hmap = new HashMap<>();
        int i = 0;
        while (st.hasMoreTokens()) {
            hmap.put(i, new ArrayList<>());
            h[i] = Integer.parseInt(st.nextToken());
            i++;
        }

        int a, b;
        for (int j = 0; j < m; j++) {
            st = new StringTokenizer(br.readLine());
            a = Integer.parseInt(st.nextToken())-1;
            b = Integer.parseInt(st.nextToken())-1;

            //if (!hmap.containsKey(a)) hmap.put(a, new ArrayList<>());
            //if (!hmap.containsKey(b)) hmap.put(b, new ArrayList<>());

            hmap.get(a).add(b);
            hmap.get(b).add(a);
        }
        br.close();

        int ans = 0;
        main:
        for (int j : hmap.keySet()) {
            for (int k : hmap.get(j)) {
                if (h[j] <= h[k]) continue main;
            }
            ans++;
        }
        System.out.println(ans);
    }
}

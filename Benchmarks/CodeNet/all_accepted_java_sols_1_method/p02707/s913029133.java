import java.io.*;
import java.util.*;

/**
 * Created by Ayushi on 19 Apr 2020.
 * Problem:
 * Round:
 */

public class Main {
    public static void main(String[] args) throws IOException {
        HashMap<Integer, Integer> hmap = new HashMap<>();
        hmap.put(1, 0);
        StringTokenizer st;
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        st = new StringTokenizer(br.readLine(), " ");
        int a;
        for (int i = 2; i <= n; i++){
            hmap.put(i, 0);
            a = Integer.parseInt(st.nextToken());
            hmap.replace(a, hmap.get(a)+1);
        }
        br.close();

        for (int j = 1; j <= n; j++) {
            System.out.println(hmap.get(j));
        }
    }
}

import java.io.*;
import java.util.*;

/**
 * Created by Ayushi on 26 Apr 2020.
 * Problem:
 * Round:
 */

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        //ArrayList<String> arr = new ArrayList<>();
        //HashMap<String, Integer> hmap = new HashMap<>();
        Set<String> s = new HashSet<>();
        //int ans = 0;
        while (n-- > 0) {
            String a = br.readLine();
            s.add(a);
            /*if (!arr.contains(a)) {
                ans++;
                arr.add(a);
            }*/
        }
        br.close();
        System.out.println(s.size());
    }
}

import java.util.*;
import java.io.InputStreamReader;
import java.io.BufferedReader;


public class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        String[] s = br.readLine().split(" ");
        
        Map<Integer, Integer> m = new HashMap();
        for (int i = 0; i < n; i++) {
            int x = Integer.parseInt(s[i]);
            if (m.get(x) == null) m.put(x, 1);
            else m.put(x, m.get(x)+1);
        }
        
        Set<Integer> keys = m.keySet();
        int count = 0;
        for (Integer key : keys) {
            Integer val = m.get(key);
            if (key > val) {
                count += val;
            }
            if (key < val) {
                count += (val-key);
            }
        }
        System.out.println(count);
    }
}




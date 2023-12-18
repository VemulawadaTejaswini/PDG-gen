import java.util.Arrays;
import java.util.Map;
import java.util.Scanner;
import java.util.TreeMap;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt(), f = sc.nextInt(), c = 0;
        Map<String, Integer> mp = new TreeMap<>();
        for (int i = 0; i < n; i++) {
            int m = sc.nextInt();
            String[] v = new String[m];
            for (int j = 0; j < m; j++) {
                v[j] = sc.next();
                for (int k = 0; k < j; k++) {
                    String[] t = { v[j], v[k] };
                    Arrays.sort(t);
                    String tt=t[0]+" "+t[1];
                    if(mp.containsKey(tt)) {
                        mp.put(tt, mp.get(tt)+1);
                        if(mp.get(tt)==f) {
                            c++;
                        }
                    }else {
                        mp.put(tt, 1);
                    }
                }
            }
        }
        System.out.println(c);
        for (Map.Entry<String, Integer> m : mp.entrySet()) {
            if (m.getValue() >= f) {
                System.out.println(m.getKey());
            }
        }
    }
}

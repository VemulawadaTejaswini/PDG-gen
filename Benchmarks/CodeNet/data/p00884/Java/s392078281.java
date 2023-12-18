import java.util.*;

class Main {

    final static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        while (true) {
            int n = sc.nextInt();
            if (n == 0) break;
            
            String[] s = new String[n];
            String[][] tmp = new String[n][];
            for (int i = 0; i < n; ++i) {
                s[i] = sc.next();
            }
            
            Map<String, Set<String>> map = new HashMap<String, Set<String>>();
            for (int i = 0; i < n; ++i) {
                tmp[i] = s[i].split("[:.,]");
                String key = tmp[i][0];
                Set<String> set = new HashSet<String>();
                for (int j = 1; j < tmp[i].length; ++j) {
                    set.add(tmp[i][j]);
                }
                map.put(key, set);
            }
            
            Set<String> set = map.get(tmp[0][0]);
            boolean f = false;
            do {
                f = false;
                String[] sana = new String[set.size()];
                sana = set.toArray(sana);
                for (String key: sana) {
                    if (map.containsKey(key)) {
                        f = true;
                        Set<String> siro = map.get(key);
                        set.remove(key);
                        for (String t: siro) {
                            set.add(t);
                        }
                    }
                }
            } while (f);
                        
            System.out.println(set.size());
        }
    }
}

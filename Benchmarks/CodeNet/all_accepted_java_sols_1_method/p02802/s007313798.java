import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = Integer.parseInt(sc.next());
        int m = Integer.parseInt(sc.next());
        Set<Integer> ac = new HashSet<>();
        Map<Integer, Integer> wa = new HashMap<>();
        for (int i = 0; i < m; i++) {
            int p = Integer.parseInt(sc.next());
            String s = sc.next();
            if("AC".equals(s)) {
                ac.add(p);
            }else {
                if(!ac.contains(p)) {
                    int w = wa.getOrDefault(p, 0);
                    w++;
                    wa.put(p, w);
                }
            }
        }
        int res = 0;
        for(int i:ac) {
            res += wa.getOrDefault(i, 0);
        }
        System.out.println(ac.size() + " " + res);
    }
}

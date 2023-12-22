import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        Map<String, Integer> m = new HashMap<>(n);
        for(int i=0; i<n; i++) {
            String s = in.next();
            if(m.containsKey(s)) {
                m.put(s, m.get(s)+1);
            }
            else {
                m.put(s, 1);
            }
        }
        Set<String> keySet = m.keySet();
        int maxCount = 0;
        Iterator<String> it = keySet.iterator();
        while(it.hasNext()) {
            String s = it.next();
            int c = m.get(s);
            maxCount = Math.max(maxCount, c);
        }
        it = keySet.iterator();
        SortedSet<String> results = new TreeSet<>();
        while(it.hasNext()) {
            String s = it.next();
            int c = m.get(s);
            if(c==maxCount) {
                results.add(s);
            }
        }

        it = results.iterator();
        while(it.hasNext()) {
            System.out.println(it.next());
        }
    }
}

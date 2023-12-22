import java.util.*;
import java.util.Map.Entry;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        TreeMap<String, Integer> map = new TreeMap<String, Integer>();
        for (int i=0;i<N;i++) {
            String S = sc.next();
            if (map.containsKey(S)) {
                map.put(S, map.get(S)+1);
            } else {
                map.put(S, 1);
            }
        }
        ArrayList<Entry<String, Integer>> list = new ArrayList<Entry<String, Integer>>(map.entrySet());

        Collections.sort(list, (o1, o2)->Integer.compare(o2.getValue(), o1.getValue()));
        // System.out.println(list);

        int max = list.get(0).getValue();
        for (Entry<String, Integer> entry : list) {
            if (entry.getValue()==max) {
                System.out.println(entry.getKey());
            } else {
                break;
            }
        }
    }
}
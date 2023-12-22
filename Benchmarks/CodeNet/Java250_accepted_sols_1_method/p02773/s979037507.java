import java.util.*;
import java.util.Map.Entry;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        Map<String, Integer> map = new HashMap<>();
        int max = 0;
        for (int i = 0; i < n; i++) {
            String s = sc.next();
            if(!map.containsKey(s)) map.put(s, 0);
            map.put(s, map.get(s) + 1);
            if(max < map.get(s)) max = map.get(s);
        }
        List<String> list = new ArrayList<String>();
        for(Entry<String, Integer> e : map.entrySet()){
            if(e.getValue().equals(max)) list.add(e.getKey());
        }
        Collections.sort(list);
        for(String a : list) System.out.println(a);
        sc.close();

    }

}

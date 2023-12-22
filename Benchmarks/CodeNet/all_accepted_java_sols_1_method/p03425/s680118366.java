import java.util.*;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        Map<String, List<String>> map = new HashMap<>();
        for (int i = 0; i < N; i++) {
            String S = sc.next();
            String top = S.substring(0,1);
            if (top.matches("[MARCH]")) {
                if (map.containsKey(top)) {
                    map.get(top).add(S);
                } else {
                    List<String> list = new ArrayList<String>();
                    list.add(S);
                    map.put(top, list);                    
                }
            }
        }
        List<String> keys = new ArrayList<>(map.keySet());
        long count = 0;
        if (keys.size() < 3) {
            System.out.println(0);
        } else {
            for (int i = 0; i < keys.size()-2; i++) {
                String key1 = keys.get(i);
                for (int j = i+1; j < keys.size()-1; j++) {
                    String key2 = keys.get(j);
                    for (int k = j+1; k < keys.size(); k++) {
                        String key3 = keys.get(k);
                        long size1 = map.get(key1).size();
                        long size2 = map.get(key2).size();
                        long size3 = map.get(key3).size();
                        count += size1*size2*size3;
                    }
                }
            }
            System.out.println(count);
        }
    }    
}

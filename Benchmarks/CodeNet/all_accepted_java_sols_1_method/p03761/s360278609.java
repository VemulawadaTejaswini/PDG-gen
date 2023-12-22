import java.util.Map;
import java.util.Scanner;
import java.util.TreeMap;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        Map<String, Integer> map = new TreeMap<>();
        String s = sc.next();
        for(int i = 0; i < s.length(); i++){
            String b = s.substring(i, i+1);
            if(map.containsKey(b)) map.put(b, map.get(b)+1);
            else map.put(b, 1);
        }
        for (int i = 1; i < n; i++) {
            Map<String, Integer> tmp = new TreeMap<>();
            s = sc.next();
            for(int j = 0; j < s.length(); j++){
                String b = s.substring(j, j+1);
                if(tmp.containsKey(b)) tmp.put(b, tmp.get(b)+1);
                else tmp.put(b, 1);
            }
            for (String k : map.keySet()) {
                if(tmp.containsKey(k)) map.put(k, Math.min(map.get(k), tmp.get(k)));
                else map.put(k, 0);
            }
        }
        StringBuilder sb = new StringBuilder();
        for (String k : map.keySet()) {
            for (int i = 1; i <= map.get(k); i++) {
                sb.append(k);
            }
        }

        System.out.println(sb.toString());
        sc.close();
    }

}

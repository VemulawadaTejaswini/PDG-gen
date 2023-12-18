import java.util.*;

public class Main {
    public static void main(String[] args) throws Exception {
        
        Scanner sc = new Scanner(System.in);
        
        int N = sc.nextInt();
        
        Map<String, Map<Integer,Integer>> map = new TreeMap<>();
        
        for(int i = 0; i < N; i++){
            
            String S = sc.next();
            Map<Integer, Integer> map2 = map.get(S);
            if (map2 == null) {
                map2 = new TreeMap<>( (s1, s2) -> s2 - s1 );
                map.put(S, map2);
            }

            int P = sc.nextInt();
            map2.put(P, i+1);
        }
        
        for( String key : map.keySet() ){
            Map<Integer, Integer> m2 = map.get(key);
            for( int i : m2.keySet() ){
                System.out.println(m2.get(i));
            }
        }
    }
}

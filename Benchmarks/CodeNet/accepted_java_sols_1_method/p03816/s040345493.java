import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int n = Integer.parseInt(sc.next());
        Map<Integer, Integer> map = new HashMap<>();
        int a = 0;
        for(int i=0; i<n; i++) {
            a =Integer.parseInt(sc.next());
            if(map.containsKey(a)) map.put(a, map.get(a)+1);
            else map.put(a, 1);
        }
        
        if(map.size() % 2 == 0) {
            System.out.println(map.size()-1);
        }else {
            System.out.println(map.size());
        }
        
     }
}
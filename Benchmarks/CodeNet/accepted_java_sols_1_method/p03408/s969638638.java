import java.util.*;
import java.util.stream.Collectors;

import static java.lang.System.out;
public class Main {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        Map<String,Integer> map = new HashMap<>();
        long n = sc.nextLong();
        for (int i = 0; i < n ; i++) {
            String s = sc.next();
            Integer score = map.getOrDefault(s, 0);
            score += 1;
            map.put(s,score);
        }
        long m = sc.nextLong();
        for (int i = 0; i < m ; i++) {
            String s = sc.next();
            Integer score = map.getOrDefault(s, 0);
            score -= 1;
            map.put(s,score);
        }

        int max = map.values().stream().max(Comparator.naturalOrder()).get();
        if(max < 0){
            out.print(0);
        }else{
            out.print(max);
        }
    }
}
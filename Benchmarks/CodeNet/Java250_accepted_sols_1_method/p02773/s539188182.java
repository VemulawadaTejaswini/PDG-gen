import java.util.*;
import java.util.function.Predicate;
import java.util.stream.Collectors;
import java.util.stream.Stream;

import static java.util.Map.Entry.comparingByKey;
import static java.util.Map.Entry.comparingByValue;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int N = Integer.parseInt(sc.nextLine());

        Map<String, Integer> map = new HashMap<>();
        for (int i = 0; i < N; i++) {
            String s = sc.nextLine();

            Integer c = map.get(s);
            if(c == null){
                map.put(s, 0);
            } else {
                map.put(s, c+1);
            }
        }

        List<Map.Entry<String, Integer>> collect = map.entrySet().stream()
                .sorted(comparingByKey())
                .sorted(Collections.reverseOrder(comparingByValue()))
                .collect(Collectors.toList());

        int max = 0;
        for (Map.Entry<String, Integer> e : collect) {
            if(max <= e.getValue()){
                max = e.getValue();
                System.out.println(e.getKey());
            } else {
                break;
            }
        }
    }
}

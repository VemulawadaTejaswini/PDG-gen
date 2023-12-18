import java.util.*;
import java.util.stream.Collectors;

public class Main {
     public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        List<String> sList = new ArrayList<>();
        for (int i = 0; i < N; i++) {
            sList.add(sc.next());

        }
        int M = sc.nextInt();
        List<String> tList = new ArrayList<>();
        for (int i = 0; i < M; i++) {
            tList.add(sc.next());

        }
       
        Map<String, Long> sMap = sList.stream().collect(Collectors.groupingBy(s -> s, Collectors.counting()));
        Map<String, Long> tMap = tList.stream().collect(Collectors.groupingBy(s -> s, Collectors.counting()));
        long result = 0;
        for (Map.Entry<String, Long> entry : sMap.entrySet()) {
            long point = entry.getValue();
            if (tMap.containsKey(entry.getKey())) {
                point -= tMap.get(entry.getKey());

            }
            if (point > result) {
                result = point;
            }
        }
        System.out.println(result);
    } 
}
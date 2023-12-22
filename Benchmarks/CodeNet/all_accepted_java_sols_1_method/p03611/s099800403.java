import java.util.*;

public class Main {
    public static void main(String args[]) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        Map<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < n; i++) {
            int val = scanner.nextInt();
            int val1 = val + 1;
            int val2 = val - 1;
            int count = map.getOrDefault(val , 0) + 1;
            map.put(val, count);
            int count1 = map.getOrDefault(val1 , 0) + 1;
            map.put(val1, count1);
            int count2 = map.getOrDefault(val2 , 0) + 1;
            map.put(val2, count2);
        }

        List<Map.Entry<Integer, Integer>> list = new ArrayList<>(map.entrySet());
        list.sort((e1,e2) -> e2.getValue() - e1.getValue());
        System.out.println(list.get(0).getValue());
    }
}
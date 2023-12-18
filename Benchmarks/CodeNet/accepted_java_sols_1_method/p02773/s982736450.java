import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.Scanner;
import java.util.TreeMap;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = Integer.parseInt(sc.next());
        Map<String, Integer> map = new TreeMap<>();
        int max = 0;
        for (int i = 0; i < n; i++) {
            String s = sc.next();
            map.merge(s, 1, Integer::sum);
            max = Math.max(max, map.get(s));
        }
        List<Map.Entry<String, Integer>> list = new ArrayList<>(map.entrySet());
        list.sort(Map.Entry.comparingByValue());
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < list.size(); i++) {
            if (list.get(i).getValue().equals(max)) {
                sb.append(list.get(i).getKey());
                sb.append("\n");
            }
        }
        System.out.println(sb.toString());
    }
}
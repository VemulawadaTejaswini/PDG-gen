import java.util.Map;
import java.util.Scanner;
import java.util.TreeMap;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        String[] inputs = new String[N];
        Map<String, Integer> treeMap = new TreeMap<>();
        int max = 0;

        for(int i = 0; i < N; i++) {
            inputs[i] = sc.next();
        }

        for(String input: inputs) {
            if(treeMap.containsKey(input)) {
                treeMap.put(input, treeMap.get(input)+1);
                max = Math.max(max,treeMap.get(input));
            } else {
                treeMap.put(input, 1);
                max = Math.max(max,treeMap.get(input));
            }
        }

        for(Map.Entry<String, Integer> entry:treeMap.entrySet()) {
            if(entry.getValue() == max) {
                System.out.println(entry.getKey());
            }
        }

    }
}

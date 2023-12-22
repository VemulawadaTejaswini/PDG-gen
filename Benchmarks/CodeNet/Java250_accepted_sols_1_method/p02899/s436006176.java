import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;
import java.util.TreeMap;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        Map<Integer, Integer> map = new TreeMap<>();
        for(int i = 1; i < N+1; i++) {
            int key = sc.nextInt();
            map.put(key, i);
        }
        for(Map.Entry<Integer, Integer> entry : map.entrySet()) {
            int val = entry.getValue();
            System.out.print(val + " ");
        }
    }
}

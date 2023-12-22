import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;
import java.util.TreeMap;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int M = sc.nextInt();
        Map<Long, Integer> map = new TreeMap<>();
        for(int i = 0; i < N; i++) {
            long A = sc.nextLong();
            int B = sc.nextInt();
            if(map.containsKey(A)) {
                map.put(A, map.get(A)+B);
            } else {
                map.put(A,B);
            }
        }
        long res = 0;
        for(Map.Entry<Long, Integer> e : map.entrySet()) {
            if(e.getValue() <= M) {
                res += e.getKey()*e.getValue();
                M -= e.getValue();
            } else {
                res += M * e.getKey();
                break;
            }
        }
        System.out.println(res);

    }
}

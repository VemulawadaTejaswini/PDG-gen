import java.util.*;
public class Main{
    static Scanner sc = new Scanner(System.in);
    public static void main(String[] args) {
        int N = sc.nextInt();
        Map<Integer,Integer> map = new HashMap<>();
        long sum = 0;
        for(int i = 0; i < N; i++) {
            int curr = sc.nextInt();
            map.put(curr, map.getOrDefault(curr,0) + 1);
            sum += curr;
        }
        int q = sc.nextInt();
        for(int i = 0; i < q; i++) {
            int b = sc.nextInt();
            int c = sc.nextInt();
            if(map.containsKey(b)) {
                int count = map.get(b);
                sum -= (long)b * count;
                sum += (long)c * count;
                map.remove(b);
                map.put((int)c, map.getOrDefault(c, 0) + count);
            }
            System.out.println(sum);
        }
    }
}
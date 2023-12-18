import java.util.*;

public class Main {
    public static void main(String[] args) throws Exception {
        // Your code here!
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        TreeMap<Integer, Integer> map = new TreeMap<Integer, Integer>();
        long sum = 0;
        for (int i = 0; i < n; i++) {
            int num = sc.nextInt();
            int val = map.getOrDefault(num, 0);
            map.put(num, ++val);
            sum = sum + num;
        }
        
        int q = sc.nextInt();
        while (q-- > 0) {
            int prev = sc.nextInt();
            int next = sc.nextInt();
            
            long dif = next - prev;
            
            int prevcount = map.getOrDefault(prev, 0);
            sum = sum + dif * prevcount;
            
            map.remove(prev);
            int val = map.getOrDefault(next, 0);
            map.put(next, val + prevcount);
            System.out.println(sum);
        }
    }
}

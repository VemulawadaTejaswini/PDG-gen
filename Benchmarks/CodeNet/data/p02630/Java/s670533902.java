import java.util.*;

public class Main {

    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        Map<Integer, Integer> map = new HashMap<>();
        long sum = 0;
        for(int i=0; i<n; i++) {
            int num = sc.nextInt();
            map.put(num, map.getOrDefault(num, 0) + 1);
            sum += num;
        }
        int q = sc.nextInt();
        for(int i=0; i<q; i++) {
            int b = sc.nextInt();
            int c = sc.nextInt();

            if(!map.containsKey(b)) {
                System.out.println(sum);
                continue;
            }

            int count = map.get(b);
            long diff = ((long)c - b) * (long)count;
            sum += diff;
            System.out.println(sum);
            map.remove(b);
            map.put(c, map.getOrDefault(c, 0) + count);
        }

    }




}
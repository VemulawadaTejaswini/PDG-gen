import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        Map<Integer, Integer> countMap = new HashMap<>();
        long sum = 0;
        for (int j=0; j<n; j++) {
            int a = sc.nextInt();
            sum += a;
            Integer count = countMap.get(a);
            if (count == null) {
                countMap.put(a, 1);
            } else {
                countMap.put(a, count+1);
            }
        }
        int q = sc.nextInt();
        for (int i=0; i<q; i++) {
            int b = sc.nextInt();
            int c = sc.nextInt();

            long diffSum  = c-b;
            Integer fromCount = countMap.get(b);
            if (fromCount != null) {
                sum = sum + diffSum * fromCount;
                countMap.remove(b);
                Integer toCount = countMap.get(c);
                if (toCount == null) {
                    countMap.put(c, fromCount);
                } else {
                    countMap.put(c, toCount + fromCount);
                }
            }
            System.out.println(sum);
        }
    }
}
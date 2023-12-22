import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] a = new int[n];
        for (int i = 0;i < n; i++) {
            a[i] = sc.nextInt();
        }

        Map<Integer, Integer> map = new HashMap<>();
        for (int i = 0;i< n; i++) {
            map.put(a[i], i);
        }
       Arrays.sort(a);
      

        for (int i : a) {
            System.out.print(map.get(i) +1 + " ");
        }
    }
}

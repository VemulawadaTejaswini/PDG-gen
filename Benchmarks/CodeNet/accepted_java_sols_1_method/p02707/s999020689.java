import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int[] a = new int[n+1];
        Map<Integer, Integer> m = new HashMap<>();
        for(int i=2; i<=n; i++) {
            a[i] = in.nextInt();
            if(m.containsKey(a[i])) {
                m.put(a[i], m.get(a[i])+1);
            }
            else {
                m.put(a[i], 1);
            }
        }
        for(int i=1; i<=n; i++) {
            int c = 0;
            if(m.containsKey(i)) {
                c = m.get(i);
            }
            System.out.println(c);
        }
    }
}

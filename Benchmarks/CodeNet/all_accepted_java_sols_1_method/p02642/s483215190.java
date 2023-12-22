
import java.util.*;

public class Main {
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        int[] a = new int[n];
        for (int i = 0; i < a.length; i++) {
            a[i] = sc.nextInt();
        }

        Arrays.sort(a);

        int max = a[n-1];

        int[] aa = new int[max + 1];
        Set<Integer> dup = new HashSet<>();
        for (int k : a) {
            if (aa[k] == 0) {
                for (int i = 2 * k; i < max + 1; i = i + k) {
                    aa[i] = 1;
                }
                aa[k] = 1;
                dup.add(k);
            } else {
                if (dup.contains(k)) dup.remove(k);
            }
        }

        System.out.println(dup.size());
    }
}
import java.util.*;
import java.lang.*;


public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] a = new int[n];
        for (int i = 0; i < n; i++) {
            a[i] = sc.nextInt();
        }
        boolean end = false;
        int light = a[0];
        int count = 1;
        Set<Integer> set = new TreeSet<>();
        set.add(1);
        set.add(light);
        while (true) {
            if (light == 2) {
                break;
            } else if(set.contains(a[light - 1])) {
                end = true;
                break;
            } else {
                light = a[light - 1];
                set.add(light);
                count++;
            }
        }
        if (end) {
            System.out.println(-1);
        } else {
            System.out.println(count);
        }
    }
}
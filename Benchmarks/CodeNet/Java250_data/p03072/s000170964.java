import java.util.*;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] h = new int[n];
        for (int i = 0; i < h.length; i++) {
            h[i] = sc.nextInt();
        }
        int sight = 1;
        label: for (int i = 1; i < h.length; i++) {
            for (int j = 0; j < i; j++) {
                if (h[j] > h[i] ) {
                    continue label;
                }
            }
            sight++;
        }
        System.out.println(sight);
        sc.close();
    }
}
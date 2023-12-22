import java.util.*;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int k = sc.nextInt();
        Integer[] h = new Integer[n];
        long sum = 0;
        for (int i = 0; i < h.length; i++) {
            h[i] = sc.nextInt();
        }
        Arrays.sort(h, Collections.reverseOrder());
        for (int i = k; i < h.length; i++) {
            sum += h[i];
        }
        System.out.println(sum);
        sc.close();
    }
}
import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int k = sc.nextInt();

        int[] h = new int[n];
        int[] tmp = new int[k];

        for (int i = 0; sc.hasNext(); i++) {
            h[i] = sc.nextInt();
        }

        Arrays.sort(h);

        // 値を１つずつインクリメントさせて、k個先の値との差分をとる
        int minValue = Integer.MAX_VALUE;
        for (int i = 0; i <= h.length - k; i++) {

            if (h[i + (k-1)] - h[i] < minValue) {
                minValue = h[i + (k-1)] - h[i];
            }
        }

        System.out.println(minValue);
    }
}
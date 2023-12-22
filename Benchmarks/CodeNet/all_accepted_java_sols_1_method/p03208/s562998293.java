import java.util.*;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int k = sc.nextInt();
        int[] h = new int[n];
        for(int i = 0; i < n; i++) {
            h[i] = sc.nextInt();
        }
        Arrays.sort(h);
        int min = h[k-1] - h[0];
        for(int i = k; i < n; i++) {
            min = Math.min(min, h[i] - h[i-k+1]);
        }
        System.out.println(min);
    }
}

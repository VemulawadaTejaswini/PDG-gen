import java.util.*;
import java.lang.*;


public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int d[] = new int[n];
        for (int i = 0; i < n; i++) {
            d[i] = sc.nextInt();
        }
        int count = 1;
        Arrays.sort(d);
        for (int i = 1; i < n; i++) {
            if (d[i] != d[i - 1]) {
                count++;
            }
        }
        System.out.println(count);
    }
}

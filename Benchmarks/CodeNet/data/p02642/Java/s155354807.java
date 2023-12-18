import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] a = new int[n];
        for (int i=0; i<n; i++) {
            a[i] = sc.nextInt();
        }
        Arrays.sort(a);
        int count = 0;
        for (int i=0; i<n; i++) {
            if (i+1 < n && a[i] == a[i+1]) {
                continue;
            }
            boolean divisible = false;
            for (int j=0; j<i; j++) {
                if (a[i] % a[j] == 0) {
                    divisible = true;
                    break;
                }
            }
            if (!divisible) {
                count++;
            }
        }
        System.out.println(count);
    }
}
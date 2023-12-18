import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] a = new int[n];
        int[] count = new int[100000];
        for (int i = 0; i < n; i++) {
            a[i] = sc.nextInt();
            count[a[i]]++;
        }
        int max = count[0] + count[1] + count[2];
        for (int i = 2; i < 99999; i++) {
            if (max < count[i - 1] + count[i] + count[i + 1])
                max = count[i - 1] + count[i] + count[i + 1];
        }
        System.out.println(max);
    }
}

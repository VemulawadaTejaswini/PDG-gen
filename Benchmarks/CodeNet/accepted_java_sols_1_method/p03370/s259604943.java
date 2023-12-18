import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int x = sc.nextInt();
        int sum = 0;
        int count = n;
        int[] m = new int[n];
        for (int i = 0; i < n; i++) {
            m[i] = sc.nextInt();
        }
        for (int i = 0; i < n; i++) {
            sum += m[i];
        }
        x -= sum;
        Arrays.sort(m);
        count += x / m[0];
        System.out.println(count);
    }
}
import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = Integer.parseInt(scanner.next());
        int m = Integer.parseInt(scanner.next());
        int[] a = new int[n];
        int sum = 0;
        int ai;
        for (int i = 0; i < n; i++) {
            ai = Integer.parseInt(scanner.next());
            sum += ai;
            a[i] = ai;
        }
        Arrays.sort(a);
        if ((4*m)*a[n-m] < sum) {
            System.out.println("No");
        } else {
            System.out.println("Yes");
        }
    }
}
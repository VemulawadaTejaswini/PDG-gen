import java.util.*;

public class Main {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] a = new int[n];
        for (int i = 0; i < n; i++) {
            a[i] = sc.nextInt();
        }
        Arrays.sort(a);

        int count = n;
        for (int i = n; i >= 0; i--) {
            for (int j = 0; j < i; j++) {
                if (a[i] % a[j] == 0) {
                    count--;
                    break;
                }
            }
        }

        System.out.println(count);
    }

}
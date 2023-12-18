import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n, m;
        while (true) {
            n = sc.nextInt();
            m = sc.nextInt();
            int arr[] = new int[n];
            if (n == 0 && m == 0) break;
            for (int i = 0; i < n; ++i) {
                arr[i] = 0;
            }
            int mm = m;
            boolean f = true;
            while (f) {
                for (int i = 0; i < n; ++i) {
                    if (m > 0) {
                        m--;
                        arr[i]++;
                    }
                    else if (m == 0) {
                        if (arr[i] > 0) {
                            m += arr[i];
                            arr[i] = 0;
                        }
                    }
                }
                for (int i = 0; i < n; ++i) {
                    if (mm == arr[i]) {
                        System.out.println(i);
                        f = false;
                    }
                }
            }
        }
    }
}
import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] l = new int[n];
        for (int i = 0; i < n; ++i) {
            l[i] = sc.nextInt();
        }
        if (n <= 2) {
            System.out.println(0);
            return;
        }
        int count = 0;
        for (int i = 0; i < n - 2; ++i) {
            for (int j = i + 1; j < n - 1; ++j) {
                for (int k = j + 1; k < n; ++k) {
                    if (l[i] >= l[j] + l[k] || l[j] >= l[i] + l[k] || l[k] >= l[i] + l[j]) {
                        continue;
                    }
                    if (l[i] == l[j] || l[j] == l[k] || l[k] == l[i]) {
                        continue;
                    }
                    ++count;
                }
            }
        }
        System.out.println(count);
    }
}

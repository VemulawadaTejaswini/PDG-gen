import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] l = new int[n];
        for (int i = 0; i < n; i++) l[i] = sc.nextInt();
        Arrays.sort(l);

        int result = 0;
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < i; j++) {
                for (int k = 0; k < j; k++) {
                    if (l[k] != l[j] && l[i] != l[j] && l[k] + l[j] > l[i]) {
                        result++;
                    }
                }
            }
        }
        System.out.println(result);
    }
}
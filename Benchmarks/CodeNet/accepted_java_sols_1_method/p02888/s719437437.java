import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] array = new int[n];
        for (int i = 0; i < n; i++) {
            array[i] = sc.nextInt();
        }
        Arrays.sort(array);
        int ans = 0;
        for (int i = 0; i < n - 2; i++) {
            int a = array[i];
            for (int j = i + 1; j < n - 1; j++) {
                int b = array[j];
                for (int k = j + 1; k < n; k++) {
                    int c = array[k];
                    if (c >= a + b) {
                        break;
                    } else if (c < a + b) {
                        ans++;
                    }
                }
            }
        }
        System.out.println(ans);
    }
}

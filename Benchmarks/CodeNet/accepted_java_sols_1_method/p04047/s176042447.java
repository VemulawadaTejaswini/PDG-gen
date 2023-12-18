import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();

        int[] L = new int[2 * N];
        for (int i = 0; i < L.length; i++) {
            L[i] = sc.nextInt();
        }
        Arrays.sort(L);

        int result = 0;
        for (int i = 0; i < L.length; i += 2) {
            result = result + Math.min(L[i] , L[i + 1]);
        }
        System.out.println(result);
    }
}

import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int x = sc.nextInt();
        int y = sc.nextInt();
        int k = Integer.max(n - 1, Math.abs(x - 1) + Math.abs(y - n) + 1);
        int[] result = new int[k];

        for(int i = 1;i <= n;i++) {
            for(int j = i + 1;j <= n;j++) {
                int directD = j - i;
                int viaD = Math.abs(x - i) + Math.abs(y - j) + 1;
                result[Integer.min(directD, viaD) - 1]++;
            }
        }

        Arrays.stream(result).forEachOrdered(System.out::println);
    }
}

import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int k = sc.nextInt();
        int[] lengths = new int[n];
        for (int i = 0; i < n; i++) {
            lengths[i] = sc.nextInt();
        }
        Arrays.sort(lengths);
        int maxLength = 0;
        for (int i = 0; i < k; i++) {
            maxLength += lengths[n - 1 - i];
        }
        System.out.println(maxLength);
    }

}

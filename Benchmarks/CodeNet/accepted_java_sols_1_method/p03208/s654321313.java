import java.util.Arrays;
import java.util.Comparator;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int count = 0;
        int n = sc.nextInt();
        int k = sc.nextInt();
        Integer[] input = new Integer[n];
        for (int i = 0; i < n; i++) {
            input[i] = sc.nextInt();
        }
        Arrays.sort(input, Comparator.reverseOrder());
        int max = Integer.MAX_VALUE;
        for (int i = k - 1; i < n; i++) {
            if (input[i - (k - 1)] - input[i] < max) {

                max = input[i - (k - 1)] - input[i];
            }
            if (max == 0)
                break;
        }
        System.out.println(max);
    }
}
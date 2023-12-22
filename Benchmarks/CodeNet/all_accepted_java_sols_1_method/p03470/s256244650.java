import java.util.*;

public class Main {
    public static void main(final String[] args) {
        final Scanner sc = new Scanner(System.in);
        // 整数の入力
        // final int a = sc.nextInt();
        // 文字列の入力
        // final String s1 = sc.next();

        final int n = sc.nextInt();
        int[] inputNumbers = new int[n];
        int result = 1;

        for (int i = 0; i < n; i++) {
            inputNumbers[i] = sc.nextInt();
        }
        sc.close();

        Arrays.sort(inputNumbers);

        for (int i = 1; i < inputNumbers.length; i++) {
            if (inputNumbers[i] > inputNumbers[i - 1])
                result++;
        }
        System.out.println(result);
    }
}
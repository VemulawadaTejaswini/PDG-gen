import java.util.*;

public class Main {

    public static void main(String args[]) {

        // 入力
        Scanner sc = new Scanner(System.in);
        int n = Integer.parseInt(sc.next());
        String s = sc.next();
        sc.close();

        // 主処理
        int[] countW = new int[n];
        int[] countE = new int[n];
        char[] array = s.toCharArray();

        if (array[0] == 'W') {
            countW[0]++;
        }
        if (array[n - 1] == 'E') {
            countE[n - 1]++;
        }

        for (int i = 1; i < n; i++) {
            countW[i] = array[i] == 'W' ? countW[i - 1] + 1 : countW[i - 1];
            countE[n - 1 - i] = array[n - 1 - i] == 'E' ? countE[n - i] + 1 : countE[n - i];
        }

        int[] counts = new int[n];
        for (int i = 0; i < n; i++) {
            int count = countW[i] + countE[i];
            counts[i] = count;
        }
        int min = Arrays.stream(counts).min().getAsInt();
        int result = min - 1;

        // 出力
        System.out.println(result);
    }
}

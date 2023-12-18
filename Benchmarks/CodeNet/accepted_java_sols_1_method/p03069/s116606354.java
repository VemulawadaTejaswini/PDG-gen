import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(reader.readLine());
        String s = reader.readLine();
        int[] leftBkSize = new int[n + 1];
        for (int i = 0; i < n; i++) {
            leftBkSize[i + 1] = leftBkSize[i] + ((s.charAt(i) == '#') ? 1 : 0);
        }
        int min = Integer.MAX_VALUE;
        for (int i = 0; i <= n; i++) {
            // switchCount = leftBk + rightWh
            //             = leftBk + (allWh - leftWh)
            //             = leftBk + ((n - allBk) - (i - leftBk))
            //             = 2 * leftBk + n - allBk - i
            int switchCount = 2 * leftBkSize[i] + n - leftBkSize[n] - i;
            if (switchCount < min) {
                min = switchCount;
            }
        }
        System.out.println(min);
    }
}

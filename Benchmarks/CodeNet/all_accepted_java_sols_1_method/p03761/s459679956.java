import java.util.Arrays;

public class Main {
    private static java.util.Scanner scanner = new java.util.Scanner(System.in);

    public static void main(String[] args) {
        int n = scanner.nextInt();
        int[][] a = new int[n][26];
        int[] min = new int[26];
        Arrays.fill(min, 100);

        for (int i = 0; i < n; i++) {
            for (char c : scanner.next().toCharArray())
                a[i][c - 'a']++;
            for (int j = 0; j < 26; j++)
                min[j] = Math.min(min[j], a[i][j]);
        }

        int length = 0;
        for (int i : min)
            length += i;

        char[] ans = new char[length];
        for (int i = 0, r = 0; i < 26; i++)
            Arrays.fill(ans, r, r += min[i], (char)(i + 'a'));
        System.out.println(ans);
    }
}
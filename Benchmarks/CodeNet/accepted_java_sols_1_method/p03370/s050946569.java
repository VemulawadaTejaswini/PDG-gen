import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner cin = new Scanner(System.in);
        int n = cin.nextInt();
        int x = cin.nextInt();
        int [] m = new int[n];
        for (int i = 0; i < n; i++) {
            m[i] = cin.nextInt();
        }
        int remain = x - Arrays.stream(m).sum();
        int minCount = remain / Arrays.stream(m).min().orElse(remain);
        System.out.println(n + minCount);

    }
}

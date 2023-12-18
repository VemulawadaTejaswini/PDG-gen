import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] T = new int[n];
        int ans = 0;
        Arrays.setAll(T, i -> Integer.parseInt(sc.next()));
        for(int i = 0; i < n; i++) {
            for(int j = i + 1; j < n; j++) ans += T[i] * T[j];
        }
        System.out.println(ans);
    }
}

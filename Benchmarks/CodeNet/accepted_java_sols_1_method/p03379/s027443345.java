import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        StringBuilder sb = new StringBuilder();
        int n = sc.nextInt();
        int[] X = new int[n];
        Arrays.setAll(X, i -> Integer.parseInt(sc.next()));
        int[] XS = Arrays.copyOf(X, X.length);
        Arrays.sort(XS);
        int m1 = XS[(n-1) / 2];
        int m2 = XS[(n-1) / 2 + 1];
        for(int i = 0; i < n; i++) {
            if(X[i] <= m1) sb.append(m2 + "\n");
            else if(X[i] >= m2) sb.append(m1 + "\n");
        }
        System.out.print(sb);
    }
}

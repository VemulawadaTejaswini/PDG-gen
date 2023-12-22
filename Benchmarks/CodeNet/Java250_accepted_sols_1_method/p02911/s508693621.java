import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int k = sc.nextInt();
        int q = sc.nextInt();
        int[] list = new int[n];
        for (int i = 0; i < q; i++) {
            list[sc.nextInt() - 1] += 1;
        }
        for (int tmp : list) {
            System.out.println(k - (q - tmp) > 0 ? "Yes" : "No");
        }
    }
}
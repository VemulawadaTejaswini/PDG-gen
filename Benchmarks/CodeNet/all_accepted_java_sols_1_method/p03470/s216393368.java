import java.util.*;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] d = new int[n];
        for (int i = 0; i < n; i++) {
            d[i] = sc.nextInt();
        }
        int count = 0;
        boolean[] bool = new boolean[100];
        for (int i = 0; i < n; i++) {
            if (!bool[d[i] - 1]) {
                count++;
                bool[d[i] - 1] = true;
            }
        }
        System.out.println(count);
    }

}

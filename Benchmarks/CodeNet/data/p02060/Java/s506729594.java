import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] prices = new int[4];
        for (int i = 0; i < 4; i++) {
            prices[i] = sc.nextInt();
        }
        int[] counts = new int[4];
        for (int i = 0; i < 4; i++) {
            counts[i] = sc.nextInt();
        }
        int min = Integer.MAX_VALUE;
        for (int i = 0; ; i++) {
            int x = i * counts[0];
            for (int j = 0; ; j++) {
                int y = x + j * counts[1];
                for (int k = 0; ; k++) {
                    int z = y + k * counts[2];
                    int l = 0;
                    if (z < n) {
                        l = (n - z + counts[3] - 1) / counts[3];
                    }
                    min = Math.min(min, i * prices[0] + j * prices[1] + k * prices[2] + l * prices[3]);
                    if (z >= n) {
                        break;
                    }
                }
                if (y >= n) {
                    break;
                }
            }
            if (x >= n) {
                break;
            }
        }
        System.out.println(min);
    }
}


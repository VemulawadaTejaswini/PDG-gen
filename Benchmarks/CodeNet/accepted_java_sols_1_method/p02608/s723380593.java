import java.util.*;

public class Main {

    public static void main(String[] args) {
        // write your code here
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] array = new int[n + 1];
        double max = Math.sqrt(n);

        for (int i = 1; i < max; i++) {
            for (int j = 1; j < max; j++) {
                for (int k = 1; k < max; k++) {
                    int v = i * i + j * j + k * k + i * j + j * k + k * i;
                    if (v > n) {
                        break;
                    }
                    array[v]++;
                }
            }
        }

        for (int i = 1; i <= n; i++) {
            System.out.println(array[i]);
        }
    }
}
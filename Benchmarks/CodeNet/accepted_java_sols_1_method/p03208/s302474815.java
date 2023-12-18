import java.util.Arrays;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        int n = reader.nextInt();
        int k = reader.nextInt()-1;
        int[] h = new int[n];
        for (int i = 0; i < n; ++i)
            h[i] = reader.nextInt();
        Arrays.sort(h);
        int res = Integer.MAX_VALUE;
        for (int i = 0; i < n - k; ++i)
            if (Math.abs(h[i] - h[i + k]) < res)
                res = Math.abs(h[i] - h[i + k]);
        System.out.println(res);
        reader.close();
    }
}
import java.util.Scanner;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int m = in.nextInt();

        int[] food = new int[m];
        for (int i=0; i<m; i++) food[i] = n;

        for (int i=0; i<n; i++) {
            int k = in.nextInt();
            for (int j=0; j<k; j++) {
                int a = in.nextInt();
                food[a-1]--;
            }
        }

        int count = 0;
        for (int i=0; i<m; i++) {
            if (food[i] == 0) count++;
        }

        System.out.println(count);

        in.close();
    }
}
import java.util.Scanner;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int[] l = new int[n];
        long sum = 0;
        for (int i=0; i<n; i++) {
            l[i] = in.nextInt();
            sum += l[i];
        }

        Arrays.sort(l);
        int max = l[n-1];

        sum -= max;

        String ans = "No";
        if (max < sum) ans = "Yes";

        System.out.println(ans);

        in.close();
    }
}
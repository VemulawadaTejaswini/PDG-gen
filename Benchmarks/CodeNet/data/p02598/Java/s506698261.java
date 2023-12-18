

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Scanner;

public final class Main {

    public static void main(String[] args) {
        final Scanner in = new Scanner(new BufferedReader(new InputStreamReader(System.in)));
        final String[] line = in.nextLine().split(" ");
        final int n = Integer.parseInt(line[0]);
        final int k = Integer.parseInt(line[1]);
        final int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = in.nextInt();
        }
        in.nextLine();
        int low = 1, high = (int) 1e9;
        while (low < high) {
            final int mid = low + high >>> 1;
            int cnt = 0;
            for (int i = 0; i < n; i++) {
                cnt += arr[i] / mid;
            }
            if (k < cnt) {
                low = mid + 1;
            } else {
                high = mid;
            }
        }
        System.out.println(low);
    }
}



import java.util.Scanner;

public class Main {
    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        int n = sc.nextInt();
        int ans = getFibonach(n);
        System.out.println(ans);
    }

    private static int getFibonach(int idx) {
        int[] arr = new int[idx + 1];
        arr[0] = 1;
        arr[1] = 1;
        for (int i = 2; i <= idx; i++) {
            arr[i] = arr[i - 1] + arr[i - 2];
        }
        return arr[idx];
    }
}


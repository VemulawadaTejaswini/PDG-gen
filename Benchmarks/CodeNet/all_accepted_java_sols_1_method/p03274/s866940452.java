

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int k = sc.nextInt();
        int[] arr = new int[N];
        for(int i = 0; i < N; i++) arr[i] = sc.nextInt();

        int res = Integer.MAX_VALUE;
        int tmp = Integer.MAX_VALUE;
        for(int i = 0; i + (k - 1)< N; i++) {
            int l = arr[i];
            int r = arr[i+k-1];
            tmp = Math.min(Math.abs(l) + Math.abs(l-r), Math.abs(r) + Math.abs(l-r));
            res = Math.min(tmp, res);
        }
        System.out.println(res);
    }
}

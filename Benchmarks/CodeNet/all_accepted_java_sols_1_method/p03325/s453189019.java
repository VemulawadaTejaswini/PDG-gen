

import java.util.Scanner;

// 素数系
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        long[] arr = new long[N];
        for(int i = 0; i < N; i++) {
            arr[i] = sc.nextInt();
        }

        long res = 0;
        for(int j = 0; j < N; j++) {
            long tmp = 0;
            while(arr[j] % 2 == 0) {
                tmp++;
                arr[j] /= 2;

            }
            res += tmp;
        }
        System.out.println(res);
    }
}

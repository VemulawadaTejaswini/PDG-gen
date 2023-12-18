

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int[] arr = new int[N];
        for(int i = 0; i < N; i++) {
            arr[i] = sc.nextInt();
        }
        int q = sc.nextInt();
        int res = 0;
        for(int i = 0; i < q; i++) {
            int B = sc.nextInt();
            int C = sc.nextInt();
            for(int j = 0; j < arr.length; j++) {
                if(arr[j] == B) {
                    arr[j] = C;
                }
                res += arr[j];
            }
            System.out.println(res);
            res = 0;
        }
    }
}

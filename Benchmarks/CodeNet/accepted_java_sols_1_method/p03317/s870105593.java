import java.util.Scanner;

/*
1回の操作でk-1個を最小値に変換
 */
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int k = sc.nextInt();
        int[] arr = new int[N];
        for(int i = 0; i < N; i++) {
            arr[i] = sc.nextInt();
        }
        int res = 0;
        while(N > 0) {
            res++;
            N = N - k;
            if(N==0) break;
            N++;
        }
        System.out.println(res);
    }
}

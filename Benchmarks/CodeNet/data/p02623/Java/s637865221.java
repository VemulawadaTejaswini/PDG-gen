import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int M = sc.nextInt();
        int K = sc.nextInt();
        int[] a = new int[N];
        int[] b = new int[M];
        int[] sumA = new int[N];
        a[0] = sc.nextInt();
        sumA[0] = a[0];
        for(int i = 1; i < N; i++) {
            a[i] = sc.nextInt();
            sumA[i] = sumA[i-1] + a[i];
        }
        b[0] = sc.nextInt();

        for(int i = 1; i < M; i++) {
            b[i] = sc.nextInt();
        }

        int max = 0;
        int bCount = 0;
        for(int i = N-1; i >= 0; i--){
            int time = sumA[i];
            if(time > K) continue;
            else if (time == K) {
                max = Math.max(max, i);
                continue;
            }
            while(time <= K) {
                if (time + b[bCount] < K) {
                    time += b[bCount];
                    bCount++;
                } else break;
            }
            max = Math.max(bCount+i, max);
        }
        System.out.println(max);
    }

}

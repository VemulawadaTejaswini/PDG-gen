import java.util.Scanner;

public class Main {
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        final long N = sc.nextLong();
        final int X = sc.nextInt();
        final int M = sc.nextInt();
        
        if (X == 0) {
            System.out.println(0);
            return;
        }
        
        int A = X;
        
        // 数列の累積和を記録する。
        long[] sum = new long[M + 1];
        sum[0] = A;
        
        // その項が数列の何番目（0開始）に現れたかを記録する。
        int[] idx = new int[M + 1];
        idx[A] = 0;
        
        int i = 1;
        for (; i < N; i++) {
            long B = A;
            A = (int) (B * B % M);
            
            if (A == X || 0 < idx[A]) {
                break;
                
            } else {
                sum[i] = sum[i - 1] + A;
                idx[A] = i;
            }
        }
        
        if (i == N) {
            System.out.println(sum[i - 1]);
            return;
        }
        
        int idxRepeatStart = idx[A];
        
        int lenPrefix = idxRepeatStart;
        int lenRepeat = i - idxRepeatStart;
        long numRepeats = (N - lenPrefix) / lenRepeat;
        int lenSuffix = (int) (N - lenPrefix - lenRepeat * numRepeats);
        
        long sumPrefix = sum[idxRepeatStart - 1];
        long sumRepeat = sum[i - 1] - sumPrefix;
        long sumSuffix = sum[idxRepeatStart + lenSuffix - 1] - sumPrefix;
        
        long answer = sumPrefix + sumRepeat * numRepeats + sumSuffix;
        System.out.println(answer);
    }
}

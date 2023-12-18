import java.util.Scanner;

public class Main {

    static int N;
    static long K;
    static long[] A;

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        N = sc.nextInt();
        K = sc.nextLong();
        A = new long[N + 1];
      long max2 = 0;

        for(int i = 0 ; i < N ; i++) {
        	A[i] = sc.nextLong();
        	max2 = Math.max(A[i],max2);
        }

        long max = max2;
        long min = 1l;
        if(K == 0) {
        	System.out.println(max);
        	return;
        }

        // 二分探索
        for (;;) {
            // mid
            long mid = (max + min) / 2;
            if (canSolve(mid)) {
                min = mid;
            } else {
                max = mid;
            }

            if (max - min <= 1) {
                // 終わり
                break;
            }
        }
        if(canSolve2(min))
        System.out.println(min);
        else {
        	 System.out.println(min + 1);
        }

    }


    // 解けるかどうか
    static boolean canSolve(long num) {
    	int sum = 0;
    	for(int i = 0 ; i < N ; i++) {
    		sum += A[i] / num;
    	}
    	return sum > K ? true : false;

    }
    static boolean canSolve2(long num) {
    	int sum = 0;
    	for(int i = 0 ; i < N ; i++) {
    		sum += A[i] / num;
    	}
    	return sum == K ? true : false;

    }
}


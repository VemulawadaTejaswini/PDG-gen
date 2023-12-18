
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        final long MAX = 1000000000000000000L;
        final int N = sc.nextInt();
        long[] a = new long[N];
        boolean flag = true;
        for(int i=0;i<N;i++){
            a[i] = sc.nextLong();
            if(a[i] == 0){
                flag = false;
                System.out.println(0);
                break;
            }
        }
        if(flag) {
            long ans = 1;
            for (int i = 0; i < N; i++) {
                if (ans < MAX / a[i]+1) {
                    ans *= a[i];
                } else {
                    flag = false;
                    System.out.println(-1);
                    break;
                }
                if (ans > MAX) {
                    flag = false;
                    System.out.println(-1);
                    break;
                }
            }
            if (flag) {
                System.out.println(ans);
            }
        }
    }

}

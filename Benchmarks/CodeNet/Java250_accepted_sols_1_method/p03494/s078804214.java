import java.util.*;

public class Main {
    public static void main(final String[] args) {
        final Scanner sc = new Scanner(System.in);
        int N = 0;
        N = sc.nextInt();
        int[] ar = new int[N];

        for (int i = 0; i < N; i++) {
            ar[i] = sc.nextInt();
        }

        int KisuFlag = 0;
        int count = 0;
        while (KisuFlag == 0) {
            for (int i = 0; i < N; i++) {
                if (ar[i] % 2 != 0) {
                    KisuFlag = 1;
                }
            }
            if(KisuFlag==1){
                break;
            }
            for(int i=0;i<N;i++){
                ar[i]=ar[i]/2;
            }
            count++;
        }
        System.out.println(count);

    }
}
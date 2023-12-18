
import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String args[]) {
        Scanner scn = new Scanner(System.in);
        int N = scn.nextInt();
        int K = scn.nextInt();
        int[] A = new int[N];
        int[] B = new int[N];

        for (int i = 0; i < N; i++) {
            A[i] = scn.nextInt();
        }

        for(int i=0;i<K;i++) {

            Arrays.fill(B,0);

            for (int i2 = 0; i2 < N; i2++) {
                int t = A[i2];
                int d1 = i2 - t;
                int d2 = i2 + t;
                if (d1 < 0) {
                    d1 = 0;
                }
                B[d1]+=1;
                if (d2 < N-1) {
                    B[d2+1]-=1;
                }
            }
            for(int i3=1;i3<N;i3++){
                B[i3]+=B[i3-1];
            }
            for(int i4=0;i4<N;i4++){
                int temp=B[i4];
                A[i4]=temp;
            }

        }



        System.out.printf("%d",A[0]);
        for(int i=1;i<N;i++){
            System.out.printf(" %d",A[i]);
        }
        System.out.printf("%n");

        scn.close();

    }

}
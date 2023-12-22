import java.util.Scanner;

/**
 * Main
 */
public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();
        int M = sc.nextInt();
        int[] H = new int[N];
        int[] A = new int[M];
        int[] B = new int[M];
        int[] highlow = new int[N]; // 0==high, 1==low

        for(int i=0; i<N; i++){
            H[i] = sc.nextInt();
        }
  
        // input
        for(int i=0; i<M; i++){
            A[i] = sc.nextInt();
            B[i] = sc.nextInt();
            // dicide highlow
            if(H[A[i]-1] > H[B[i]-1]){
                highlow[B[i]-1] = 1;
            }else if(H[A[i]-1] < H[B[i]-1]){
                highlow[A[i]-1] = 1;
            }else{
                highlow[A[i]-1] = 1;
                highlow[B[i]-1] = 1;
            }
        }

        // logic
        int count = 0;
        for(int i=0; i<N; i++){
            if(highlow[i] == 0){
                count++;
            }
        }
        System.out.println(count);
    }
}
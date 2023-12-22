import java.util.Scanner;

/**
 * Main
 */
public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();
        int K = sc.nextInt();
        int[] d = new int[K];
        int[] A = new int[N];
        int tmp;

        for(int i=0; i<K; i++){
            d[i] = sc.nextInt();
            for(int j=0; j<d[i]; j++){
                tmp = sc.nextInt();
                A[tmp-1] = 1;
            }
        }

        int count = 0;
        for(int i=0; i<N; i++){
            if(A[i]==0){
                count++;
            }
        }
        System.out.println(count);
    }
}
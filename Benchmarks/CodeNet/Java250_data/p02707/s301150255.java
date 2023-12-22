import java.util.Scanner;

/**
 * Main
 */
public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();
        int[] A = new int[N];
        int[] count = new int[N];

        for(int i = 0; i<N-1; i++){
            A[i] = sc.nextInt()-1;
            count[A[i]] = count[A[i]] + 1;
        }

        for(int i = 0; i<N; i++){
            System.out.println(count[i]);
        }
    }
}
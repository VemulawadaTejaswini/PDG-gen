import java.util.Scanner;

/**
 * Main
 */
public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int M = sc.nextInt();
        int[] A = new int[N];
        int total = 0;

        for(int i = 0; i < N; i++){
            A[i] = sc.nextInt();
            total += A[i];
        }
        sc.close();

        double standard = 1/(4 * (double)(M));
        int count = 0;

        for(int i = 0; i<N; i++){
            if((double)(A[i]) >= total * standard){
                count++;
            }
        }
        if(count >= M){
            System.out.println("Yes");
        }else{
            System.out.println("No");
        }

    }
}
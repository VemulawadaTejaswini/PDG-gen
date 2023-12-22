import java.util.Scanner;

/**
 * Main
 */
public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();
        int M = sc.nextInt();
        int[] A = new int[M];

        int rest = N;
        for(int i = 0; i < M; i++){
            A[i] = sc.nextInt();
            rest -= A[i];
        }

        if(rest < 0){
            System.out.println(-1);
        }else{
            System.out.println(rest);
        }
    }
}
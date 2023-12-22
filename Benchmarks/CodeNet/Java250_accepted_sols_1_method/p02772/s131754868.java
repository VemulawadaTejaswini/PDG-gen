import java.util.Scanner;

/**
 * Main
 */
public class Main {

    public static void main(String[] args) {
        final Scanner sc = new Scanner(System.in);
        // 整数の入力
        final int N = sc.nextInt();
        int[] A = new int[N];
        int flag = 0;

        for (int i = 0; i < N; i++){
            A[i] = sc.nextInt();
            if(A[i] % 2 == 0){
                if(A[i] % 3 != 0 && A[i] % 5 != 0){
                    flag = 1;
                    break;
                }
            }
        }

        if(flag == 0){
            System.out.println("APPROVED");
        }else{
            System.out.println("DENIED");
        }
        
        
    }
}
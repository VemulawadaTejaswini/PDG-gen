import java.util.Scanner;
public class Main {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int[] A = new int[(int)(N - 1)];
        int[] B = new int[(int)(N)];
        
        for(int i = 0 ; i < N - 1 ; i++){
                A[i] = sc.nextInt();
                B[A[i] - 1] = B[A[i] - 1] + 1; 
        }
        for(int i = 0 ; i < N ; i++){
            System.out.println(B[i]);
        
        }        
     }
}
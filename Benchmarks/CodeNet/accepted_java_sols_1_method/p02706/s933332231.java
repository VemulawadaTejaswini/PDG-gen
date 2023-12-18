import java.util.*;
 
public class Main {
 
    public static void main(String[] args) {
        Scanner stdIn = new Scanner(System.in);
        int N = stdIn.nextInt();        
        int M = stdIn.nextInt();  
        int sum = 0;
        int[] A = new int[M];      
        for (int i = 0; i < M; i++) {
            A[i] = stdIn.nextInt();
            sum += A[i];
        }
        stdIn.close();

        if (sum > N) {
            System.out.println(-1);
        } else {
            System.out.println(N - sum);
        }
    }
}
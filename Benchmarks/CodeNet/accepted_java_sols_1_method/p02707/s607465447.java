import java.util.*;
 
public class Main {
 
    public static void main(String[] args) {
        Scanner stdIn = new Scanner(System.in);
        int N = stdIn.nextInt();        
        int[] vote = new int[N];
        int[] A = new int[N - 1];      
        for (int i = 0; i < N - 1; i++) {
            A[i] = stdIn.nextInt();
            vote[A[i] - 1]++;
        }
        stdIn.close();
        for (int i = 0; i < N; i++) {
            System.out.println(vote[i]);
        }

    }
}
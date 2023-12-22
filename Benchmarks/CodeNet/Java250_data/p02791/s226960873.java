import java.util.*;
 
public class Main {
 
    public static void main(String[] args) {
        Scanner stdIn = new Scanner(System.in);
        int N = stdIn.nextInt();    
        int[] P = new int[N];
        for (int i = 0; i < N; i++) {
            P[i] = stdIn.nextInt();
        }   
        stdIn.close();

        int count = 1;
        int min = P[0];
        for (int i = 1; i < N; i++) {
            if (P[i] < min) {
                min = P[i];
                count++;
            }
        }
        System.out.println(count);

    }
}
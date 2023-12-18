import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int N = scan.nextInt();// cards
        int M = scan.nextInt();// gates
        int[] L = new int[M];
        int[] R = new int[M];
        for (int i = 0; i < M; i++) {
            L[i] = scan.nextInt();
            R[i] = scan.nextInt();
        }//O(M)
        Arrays.sort(L);
        Arrays.sort(R);
        if(L[M-1] <= R[0]){
            System.out.print(R[0] - L[M-1] + 1);
        }
        else{
            System.out.print(0);
        }

    }
}
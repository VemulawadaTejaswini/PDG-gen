import java.util.*;
public class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int K = sc.nextInt(), T = sc.nextInt();
        int[] A = new int[T];
        for (int i=0;i<T;i++){
            A[i] = sc.nextInt();
        }
        int M = 0;
        for (int i=0;i<T;i++){
            M = Math.max(M, A[i]);
        }
        System.out.println(Math.max(M-1-(K-M), 0));
    }
}
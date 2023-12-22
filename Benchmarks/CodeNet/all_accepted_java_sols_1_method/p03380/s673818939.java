import java.util.*;

public class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        final int n = sc.nextInt();
        int[] A = new int[n];
        int M = 0;
        for(int i = 0;i < n;i++){
            A[i] = sc.nextInt();
            M = Math.max(M, A[i]);
        }
        int m = 0;
        for(int i = 0;i < n;i++){
            if(A[i] != M && Math.abs(M-A[i]*2) <= Math.abs(M-m*2))   m = A[i];
        }
        System.out.println(M+" "+m);
    }
}
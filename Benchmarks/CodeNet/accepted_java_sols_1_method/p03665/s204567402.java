import java.util.*;

public class Main{
    static int N;
    static int P;
    static int[] A;
    static long count;
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        
        N = sc.nextInt();
        P = sc.nextInt();
        A = new int[N];
        long odd = 0;
        for(int i = 0; i < N; i++){
            A[i] = sc.nextInt();
            if(A[i] % 2 == 0){}
            else
                odd++;
        }
        sc.close();

        if(odd == 0 && P == 0)
            System.out.println((long)Math.pow(2,N));
        if(odd == 0 && P == 1)
            System.out.println(0);
        if(odd != 0)
            System.out.println((long)Math.pow(2, N-1));
        
        
    }
}
import java.util.*;
public class Main {
    
    public static void main(String args[]){
        Scanner scanner = new Scanner(System.in);
        int N = scanner.nextInt();
        int M = scanner.nextInt();
        int[] H = new int[N];
        for (int i = 0; i < H.length; i++) {
            H[i] = scanner.nextInt();
        }
        int[] good = new int[N];
        for (int i = 0; i < good.length; i++) {
            good[i] = 1;
        }
        for (int i = 0; i < M; i++) {
            int A = scanner.nextInt()-1;
            int B = scanner.nextInt()-1;

            if(H[A] < H[B]) good[A] = 0;
            else if(H[A]==H[B]){
                good[A]=0;
                good[B]=0;
            }else{
                good[B] = 0;
            }
        }
        int res = 0;
        for(int i=0; i<N; i++){
            res += good[i];
        }
        System.out.println(res);
    }
}
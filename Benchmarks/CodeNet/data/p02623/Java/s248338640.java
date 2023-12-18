import java.util.*;

public class Main {


    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int M = sc.nextInt();
        long K = sc.nextLong();
        int[] A = new int[N];
        int[] B = new int[M];
        for(int i = 0;i<N;i++){
            A[i] = sc.nextInt();
        }
        for(int i = 0;i<M;i++){
            B[i] = sc.nextInt();
        }
        int numA = 0;
        int numB = 0;
        int ans = 0;
        while (K>0){
            int tmpA;
            int tmpB;
            if(numA>N-1&&numB>M-1){
                break;
            }
            try {
                tmpA = A[numA];
            }catch (IndexOutOfBoundsException e){
                tmpA = 2147483647;
            }
            try{
                tmpB = B[numB];
            }catch (IndexOutOfBoundsException e){
                tmpB = 2147483647;
            }
            if(tmpA>tmpB){
                K  = K - tmpB;
                numB++;
                ans++;
            } else if(tmpA<= tmpB){
                K  = K- tmpA;
                numA++;
                ans++;
            }
            

        }
        if(K<0){
            ans --;
        }
        System.out.println(ans);
    }
}


import java.util.*;

class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int D = sc.nextInt();
        int X = sc.nextInt();
        int[] A = new int[N];
        for(int i = 0; i < N; i++){
            A[i] = sc.nextInt();
        }

        for(int j = 0; j < N; j++){
            for(int k = 1; k <= D; ){
                X = X + 1;
                k = k + A[j];
            }
        }
        System.out.println(X);

    }
}
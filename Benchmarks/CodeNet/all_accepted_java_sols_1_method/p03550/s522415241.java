import java.util.*;

class Main{
    public static void main(String[] args){
        
        Scanner sc = new Scanner(System.in);
        
        int N = sc.nextInt();
        int Z = sc.nextInt();
        int W = sc.nextInt();
        int[] A = new int[N];

        for(int i=0; i<N; i++){
            A[i] = sc.nextInt();
        }

        if(N==1){
            System.out.println(Math.abs(A[0] - W));
        }
        else{
            System.out.println(Math.max(Math.abs(W - A[N - 1]), Math.abs(A[N - 2] - A[N - 1])));
        }
    }
}
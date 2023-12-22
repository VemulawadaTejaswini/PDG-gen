import java.util.*;

class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int N;
        N = sc.nextInt();
        int A[] = new int[N];

        for(int i = 0; i < N; i++){
            A[i] = sc.nextInt();
        }
        sc.close();
        Arrays.sort(A);
        int Re = A[N - 1] - A[0];

        System.out.println(Re);
    }
}
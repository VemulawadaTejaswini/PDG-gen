import java.util.*;

public class Main {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int K = sc.nextInt();
        int[] A = new int[N];
        for(int i=0;i<N;i++){
            A[i] = Integer.parseInt(sc.next());
        }

        for(int i=K+1;i<=N;i++){
            if(A[i-K-1]<A[i-1]){
                System.out.println("Yes");
            }else{
                System.out.println("No");
            }
        }
    }
}   
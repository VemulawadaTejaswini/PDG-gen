import java.util.*;
public class Main{
    public static void main(String [] args){
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int[] A = new int[N];
        for(int i = 0; i < N; i++){
            A[i] = 0;
        }
            for(int i = 1; i <= N; i++){
                int a = sc.nextInt();
                A[a-1] = i;
            }
for(int i =0;i<N;i++){
System.out.print(A[i] + " ");

    }
}
}

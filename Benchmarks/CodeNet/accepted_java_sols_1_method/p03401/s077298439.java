import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int A[] = new int[N+1];
        int ans = 0;
        for (int i = 0; i < N ; i++) {
            A[i] = sc.nextInt();
            if (i==0){
                ans += Math.abs(A[i]);
            }else{
                ans += Math.abs(A[i - 1] - A[i]);
            }
        }
        ans += Math.abs(A[N-1]);
        for (int i = 0; i < N; i++) {
            int tmp = ans;
            if (i==0){
                tmp -= Math.abs(A[i]) + Math.abs(A[i+1]-A[i]) - Math.abs(A[i+1]);
            }else if (i == N-1){
                tmp -= Math.abs(A[i] -A[i-1]) + Math.abs(A[i]) - Math.abs(A[i-1]);
            }else{
                tmp -= Math.abs(A[i] -A[i-1]) + Math.abs(A[i+1]-A[i]) - Math.abs(A[i+1]- A[i-1]);
            }
            System.out.println(tmp);

        }
    }
}
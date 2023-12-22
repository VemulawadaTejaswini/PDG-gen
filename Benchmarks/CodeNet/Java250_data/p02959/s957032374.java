import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int[] A = new int[N+1];
        int[] B = new int[N];

        for (int i = 0; i < N+1; i++) {
            A[i]=sc.nextInt();
        }
        for (int i = 0; i < N; i++) {
            B[i]=sc.nextInt();
        }

        long ans = 0;


        for (int i = 0; i < N; i++) {
            int b = Math.min(A[i],B[i]);
            ans+=b;
            int rest = B[i]-b;
            int b2 = Math.min(A[i+1],rest);
            ans+=b2;
            A[i+1] -=b2;
        }



        System.out.println(ans);

    }
}

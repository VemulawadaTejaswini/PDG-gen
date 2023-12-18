import java.util.*;
public class Main {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int[] A = new int[N];
        long ans = 0;
        for (int i = 0; i < N; i++) {
            A[i] = sc.nextInt();
        }
        Arrays.sort(A);

        ans += A[A.length-1];

        if(A.length%2==0){
            int v = A.length-2;
            for (int i = 0; i < v/2 ; i++) {
                ans += A[A.length-2-i] *2;
            }
        }else{
            int v = A.length-2;
            for (int i = 0; i < v/2 ; i++) {
                ans += A[A.length-2-i] *2;
            }
        }

        System.out.println(ans-A[0]);

    }
}
import java.util.*;

public class Main {

    static int gcd (int a, int b) {return b>0?gcd(b,a%b):a;}

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int[] count = new int[100001];
        int[] A = new int[N];
        long sum = 0;
        for(int i=0;i<N;i++){
            A[i] = sc.nextInt();
            sum += A[i];
            count[A[i]]++;
        }

        int Q = sc.nextInt();
        for(int i=0;i<Q;i++){
            int b = sc.nextInt();
            int c = sc.nextInt();
            sum = sum + c * count[b] - b* count[b];
            count[c] += count[b];
            count[b] = 0;
            System.out.println(sum);
        }


    }

}

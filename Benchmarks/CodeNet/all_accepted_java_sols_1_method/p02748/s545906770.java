import java.util.*;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int A = sc.nextInt();
        int B = sc.nextInt();
        int M = sc.nextInt();

        int[] a = new int[A];
        int[] b = new int[B];

        int minA = Integer.MAX_VALUE;
        int minB = Integer.MAX_VALUE;

        for(int i=0;i<A;i++){
            a[i] = sc.nextInt();
            minA = Math.min(a[i],minA);
        }

        for(int i=0;i<B;i++){
            b[i] = sc.nextInt();
            minB = Math.min(b[i],minB);
        }

        int ans = minA + minB;

        for(int i=0;i<M;i++){
            int x = sc.nextInt();
            int y = sc.nextInt();
            int c = sc.nextInt();

            int price = a[x-1] + b[y-1] -c;
            ans = Math.min(ans,price);

        }

        System.out.println(ans);

    }

}








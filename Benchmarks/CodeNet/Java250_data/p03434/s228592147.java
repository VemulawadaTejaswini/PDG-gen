import java.util.*;
class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int[] a = new int[N];

        for(int i = 0; i<N; i++) {
            a[i] = sc.nextInt();
        }

        Arrays.sort(a);
        int alice = 0;
        int bob = 0;
        boolean f = false;
        for(int i = N-1; i>=0; i--) {
            if(f) bob += a[i];
            else alice += a[i];
            f = !f;
        }
        System.out.println(alice-bob);


    }
}
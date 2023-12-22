import java.util.*;
class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int[] a = new int[N+2];
        int sum = 0;
        for(int i = 1; i<N+1; i++) {
            a[i] = sc.nextInt();
            sum += (int)(Math.abs(a[i]-a[i-1]));
        }
        sum += (int)(Math.abs(a[N+1]-a[N]));

        for(int i = 1; i<N+1; i++) {
            int plus = (int)(Math.abs(a[i+1] - a[i-1]));
            int minus = (int)(Math.abs(a[i+1]-a[i])) + (int)(Math.abs(a[i]-a[i-1]));
            System.out.println(sum-minus+plus);
        }

    }
}
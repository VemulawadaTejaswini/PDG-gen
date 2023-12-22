import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int[] a = new int[n];
        for(int i=0; i<n; i++) {
            a[i] = in.nextInt();
        }
        int[] m = new int[n];
        m[0] = 0;
        for(int i=0; i<n; i++) {
            m[0] += a[i] * (i%2==0 ? 1 : -1);
        }
        for(int i=1; i<n; i++) {
            m[i] = 2*(a[i-1]-(m[i-1]/2));
        }
        for(int i=0; i<n; i++) {
            System.out.print(m[i]);
            if(i<n-1) {
                System.out.print(' ');
            }
        }
        System.out.println();
    }
}

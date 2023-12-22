import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        int[] a = new int[n];
        for(int i = 0; i < n; ++i) {
            a[i] = s.nextInt();
        }
        for(int i = n - 1; 0 <= i; --i) {
            System.out.print(a[i]);
            if(1 <= i) System.out.print(' ');
        }
        System.out.println();
    }
}
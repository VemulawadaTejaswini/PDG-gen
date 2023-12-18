import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int[] a = new int[n];
        for(int i=0; i<n; i++) {
            a[i] = in.nextInt();
        }
        int xor = 0;
        for(int i=0; i<n; i++) {
            xor = xor ^ a[i];
        }
        if(xor != 0) {
            System.out.println("No");
            return;
        }
        System.out.println("Yes");
    }
}

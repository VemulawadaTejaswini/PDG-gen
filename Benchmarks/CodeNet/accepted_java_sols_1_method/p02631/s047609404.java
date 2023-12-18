import java.util.Scanner;

public class Main {
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        final int N = sc.nextInt();
        
        final int[] a = new int[N];
        int xor = 0;
        
        for (int i = 0; i < N; i++) {
            a[i] = sc.nextInt();
            xor ^= a[i];
        }
        
        StringBuilder str = new StringBuilder();
        str.append(xor ^ a[0]);
        for (int i = 1; i < N; i++) {
            str.append(" ").append(xor ^ a[i]);
        }
        
        System.out.println(str);
    }
}

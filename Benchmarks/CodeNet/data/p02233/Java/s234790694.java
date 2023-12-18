
import java.util.Scanner;

public class Main {
    static int[] fibo = new int[44 + 1];
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        fibo[1] = fibo[0] = 1;
        
        int n = sc.nextInt();
        System.out.println(f(n));
    }
    
    static int f(int n) {
        if (fibo[n] != 0) return fibo[n];
        return fibo[n] = f(n -1) + f(n - 2);
    }
}

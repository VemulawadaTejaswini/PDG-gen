import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        
        int n = Integer.parseInt(sc.next());
        
        int[] fib = new int[n+1];
        fib[0] = 1;
        if(n >= 1) fib[1] = 1;
        for(int i = 2; i <= n; i++){
            fib[i] = fib[i-2] + fib[i-1];
        }
        
        System.out.println(fib[n]);
    }
}

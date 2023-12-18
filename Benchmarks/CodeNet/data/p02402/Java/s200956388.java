import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        // Your code here!
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        
        int M = Integer.MIN_VALUE;
        int m = Integer.MAX_VALUE;
        long sum = 0;
        
        for(int i=0; i<a; i++) {
            int p = sc.nextInt();
            M = Math.max(M, p);
            m = Math.min(m, p);
            sum += p;
        }
        
        System.out.printf("%d %d %d\n", m, M, sum);
    }
}


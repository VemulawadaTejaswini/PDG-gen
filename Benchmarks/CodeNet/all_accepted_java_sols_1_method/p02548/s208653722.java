import java.util.Scanner;

public class Main {
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        final int N = sc.nextInt();
        
        long count = 0;
        for (int i = 1; i <= N - 1; i++) {
            int div = (N - 1) / i;
            count += div;
        }
        
        System.out.println(count);
    }
}

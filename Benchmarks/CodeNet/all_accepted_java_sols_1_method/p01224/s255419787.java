import java.util.*;

public class Main {
    public static void main(String[] args) throws Exception {
        Scanner in = new Scanner(System.in);
        
        while (true) {
            int N = in.nextInt();
            if (N == 0) break;
            
            int sum = 1;
            for (int i = 2; i <= (int)Math.sqrt(N); i++) {
                if (N % i == 0) {
                    sum += i;
                    if (N / i > (int)Math.sqrt(N))
                        sum += N / i;
                }
            }
            
            if (N < sum) {
                System.out.println("abundant number");
            } else if (N == 1 || N > sum) {
                System.out.println("deficient number");
            } else {
                System.out.println("perfect number");
            }
        }
    }
}


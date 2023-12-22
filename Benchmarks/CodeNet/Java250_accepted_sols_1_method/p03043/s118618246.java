import java.util.Scanner;

public class Main {
    public static void main (String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            int n = sc.nextInt();
            int k = sc.nextInt();
            double ans = 0.0;
            
            for (int i = 1; i <= n; i++) {
                
                // Probability of occurence of the event
                double prob = 1.0/n;

                int now = i;
                
                // Keep multiplying by 2 till the now exceeds k. now is the exponent on 1/2
                while (now < k) {
                    now *= 2; 
                    prob /= 2;               
                }            
                ans += prob;
            }
           System.out.println(ans);
        }    
    }
}
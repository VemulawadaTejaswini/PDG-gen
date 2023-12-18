import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        long n  = s.nextLong();
        
        int factors[] = new int[(int)n+1];
        long sum = 0;

        Arrays.fill(factors,1);
        sum = n*(n+1)/2;
        for(int i = 2; i <= n; i++) {
            for(int j = i; j <= n; j = j+i) {
//                factors[j]++;
                sum += j; 
            }
        }
//        for(int i = 1; i <= n; i++) {
//            System.out.print(factors[i]+" ");
//            sum += i*factors[i]; 
//        }
        System.out.println(sum);
    }
}
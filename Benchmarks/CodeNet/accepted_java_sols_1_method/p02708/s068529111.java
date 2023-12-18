import java.util.*;
 
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        long N = sc.nextLong();
        long K = sc.nextLong();
        long sum = 0;
        long max = N*(N+1)/2; 
        long min = N*(N+1)/2;
        for(long i = N+1; i >= K; i--){
            sum = sum + max - min + 1;
            max = max - N + i - 1; 
            min = min - i + 1;
        }
        System.out.println(sum%(1000000000+7));
    }
} 
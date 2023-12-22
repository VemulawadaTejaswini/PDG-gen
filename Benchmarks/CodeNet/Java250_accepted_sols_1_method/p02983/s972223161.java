
import java.util.Scanner;
 
public class Main {
 
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        long L = scan.nextLong();
        long R = scan.nextLong();
        
        long result = 2018;

        for (long i = L; i < R; i++){
            for (long j = i + 1; j <= R; j++){
                long mod = (i * j) % 2019;
                if(result > mod) result = mod;
                if(result == 0) break;
            }
            if(result == 0) break;
        }

        System.out.println(result);
    }
}
import java.io.IOException;
import java.util.Scanner;

public class Main {
    
    private static boolean isPrime(int q){
        if (q == 2) return true;
        if (q < 2 || ((q & 1) == 0)) return false;
        
        int i = 3;
        while (i * i <= q){
            if (q % i == 0){
                return false;
            }
            i += 2;
        }
        return true;
    }
    private static int findMaxQuadrupletPrime(int n){
        if ((n & 1) != 0){
            for (int i = n; i >= 13; i = i - 2){
                if (isPrime(i)&&isPrime(i-8)&&isPrime(i-6)&&isPrime(i-2)){
                    return i;
                }
            }
        }else{
            for (int i = n - 1; i >= 13; i = i - 2){
                if (isPrime(i)&&isPrime(i-8)&&isPrime(i-6)&&isPrime(i-2)){
                    return i;
                }
            }   
        }
        return 13;
    }
    
    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(System.in);
        while (sc.hasNext()){
            int n = sc.nextInt();
            if (n == 0){
                break;
            }
            System.out.println(findMaxQuadrupletPrime(n));
        }
    }
}
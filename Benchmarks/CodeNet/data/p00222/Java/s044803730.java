import java.io.IOException;
import java.util.Scanner;
import java.util.Arrays;

public class Main {
    private static boolean[] primesArray(int n){
        boolean[] primes = new boolean[n + 1];
        Arrays.fill(primes, true);
        primes[0] = false;
        primes[1] = false;
        
        for (int i = 2; i * i <= 2; i++){
            if (!primes[i]) continue;
            for (int j = i + i; j <= n; j += i){
                primes[j] = false;
            }
        }
        return primes;
    }
    /*
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
    }*/
    private static int BMlike(boolean[] primesArray, int q){
        int p = q;
        while (p >= 13){
            if (primesArray[p]){
                if (primesArray[p - 8]){
                    if (primesArray[p - 2]){
                        if (primesArray[p - 6]){
                            return p;
                        }else{
                            p -= 8;
                        }
                    }else{
                        p -= 4;
                    }
                }else{
                    p -= 10;
                }
            }else{
                p -= 2;
            }
        }
        return 13;
    }
    private static int findMaxQuadrupletPrime(boolean[] primesArray, int n){
        if ((n & 1) != 0){
            int p = n;
            return BMlike(primesArray, p);
        }else{
            int p = n - 1;
            return BMlike(primesArray, p);
        }
    }
    
    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(System.in);
        boolean[] primes = primesArray(10000000);
        while (sc.hasNext()){
            int n = sc.nextInt();
            if (n == 0){
                break;
            }
            System.out.println(findMaxQuadrupletPrime(primes, n));
        }
    }
}
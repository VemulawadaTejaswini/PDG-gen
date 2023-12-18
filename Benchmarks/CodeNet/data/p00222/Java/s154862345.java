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
    private static int BMlike(int q){
        int p = q;
        while (p >= 13){
            if (isPrime(p)){
                if (isPrime(p - 8)){
                    if (isPrime(p - 2)){
                        if (isPrime(p - 6)){
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
    private static int findMaxQuadrupletPrime(int n){
        if ((n & 1) != 0){
            int p = n;
            return BMlike(p);
        }else{
            int p = n - 1;
            return BMlike(p);
        }
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
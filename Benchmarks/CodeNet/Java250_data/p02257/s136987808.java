import java.util.Scanner;

class Main { 
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int N = in.nextInt();
        int count = 0;
        int borderline = 1000;
        
        boolean primes[] = new boolean [borderline];
        for(int n = 2; n < primes.length; n++){
            if(primes[n]) continue;
            for(int m = 2 * n; m < primes.length; m += n) {
                primes[m] = true;
            }
        }
        
        while (N != 0) {
            int num = in.nextInt();
            if       ((num >  borderline) && isPrime(num)) count++;
            else  if ((num <= borderline) && !primes[num]) count++;
            N--;
        }
        
        System.out.println(count);
    }
    
    public static boolean isPrime(int x) {
        if      (x == 2)     return true;
        else if (x % 2 == 0) return false;
        else {
            for (int i = 3; i * i <= x; i += 2) {
                if (x % i == 0) return false;
            }
            return true;
        }
    }
}
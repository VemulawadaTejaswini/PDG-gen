import java.util.Scanner;

public class Main {

    public static boolean isPrime(long x) {
        for (int i = 2; (long) i*i <= x; i++) {
            if (x % i == 0) {
                return false;
            }
        }
        return true;
    }


    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        long A = sc.nextLong();
        int p = 2;
        int i = 1;
        int result = 0;
        if(A == 1){
            System.out.println(0);
            return;
        }
        if(isPrime(A)){
            System.out.println(1);
            return;
        }
        while(p <= A){
            long mul = 1;
            for(int k = 0; k < i; k++){
                mul *= p;
            }
            if((A % mul) == 0){
                A = A / mul;
                i++;
                result++;
            }else{
                if(p == 2) {
                    p++;
                }else{
                    p += 2;
                }
                i = 1;
            }
        }
        System.out.println(result);
    }
}

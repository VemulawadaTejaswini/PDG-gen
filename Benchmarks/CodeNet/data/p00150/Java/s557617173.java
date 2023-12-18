import java.util.*;

public class Main{
    private static boolean isPrime(int x){
        if(x == 0 || x == 1) return false;
        for(int i = 2; i * i <= x; i++){
            if(x % i == 0){
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        while(true){
            int n = sc.nextInt();
            if(n == 0) break;

            for(int i = n; ; i--){
                if(isPrime(i) && isPrime(i - 2)){
                    System.out.println((i - 2) + " " + i);
                    break;
                }
            }
        }
    }
}
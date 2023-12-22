import java.util.*;

public class Main {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        int x = scan.nextInt();
        for(int i = x; i <= Math.pow(10, 9); i++){
            if(isPrime(i)){
                System.out.println(i);
                return;
            }
        }
        scan.close();
    }
    
    public static boolean isPrime(int n){
        for(int i = 2; i <= Math.sqrt(n); i++){
            if(n % i == 0) return false;
        }
        return true;
    }
}

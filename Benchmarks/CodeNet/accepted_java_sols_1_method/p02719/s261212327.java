import java.util.*;

public class Main {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        long n = scan.nextLong();
        long k = scan.nextLong();
        if(n >= k){
            n = n % k;
            if(n == 0){
                System.out.println(0);
                System.exit(0);
            }
            System.out.println(Math.min(Math.abs(n), Math.abs(n - k)));
        }else{
            System.out.println(Math.min(n, Math.abs(n - k)));
        }
    }
}
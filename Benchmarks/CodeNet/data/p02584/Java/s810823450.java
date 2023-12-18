
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        long x = sc.nextLong(), k = sc.nextLong(), d = sc.nextLong();
        x = Math.abs(x);
        if(x / d > k){
            System.out.println(x-k*d);
        }else{
            long newX = x % d;
            long newK = x / d;
            if(newK % 2 == 0){
                System.out.println(Math.min(newX, 2 * d - newX));
            }else{
                System.out.println(Math.min(newX + d, d - newX));
            }
        }
    }
}

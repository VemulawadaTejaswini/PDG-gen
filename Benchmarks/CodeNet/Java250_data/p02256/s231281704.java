
import java.util.Scanner;

public class Main {
    static Scanner sc = new Scanner(System.in);
    public static void main(String[] args) {
        int x = sc.nextInt();
        int y = sc.nextInt();
        int result = 0;
        if(x > y){
            result = gcd(x, y);
        } else {
            result = gcd(y, x);
        }
        System.out.println(result);
    }

    static int gcd(int x, int y){
        if(y == 0){
            return x;
        } else {
            return gcd(y, x % y);
        }   
    }
}


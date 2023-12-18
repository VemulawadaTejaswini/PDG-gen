import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        long x = sc.nextLong();
        long k = sc.nextLong();
        long d = sc.nextLong();

        if(x < 0){
            x = -x;
        }
        long n = x / d;

        if(k > n){
            if((n - k) % 2 == 0){
                System.out.println(x - n * d);
            }
            else{
                System.out.println((n + 1) * d - x);
            }
        }
        else{
            System.out.println(x - k * d);
        }
    }
}
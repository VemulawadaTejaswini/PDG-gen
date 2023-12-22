import java.util.Scanner;

public class Main {
    static Scanner sc = new Scanner(System.in);
    public static void main(String[] args) {
        long n = sc.nextLong();
        long sqrt = (long) Math.sqrt(n);
        for(long i = sqrt; i > 0; i--){
            if(n % i == 0) {
                System.out.println(n/i + i - 2);
                return;
            }
        }
    }
}
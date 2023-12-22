import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        
        long n = Long.parseLong(sc.next());
        long k = Long.parseLong(sc.next());
        
        long a = n%k;
        long b = Math.abs(k - n%k);
        System.out.println(Math.min(a, b));
    }
}
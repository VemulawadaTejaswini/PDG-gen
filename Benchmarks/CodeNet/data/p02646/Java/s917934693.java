
import java.util.Scanner;

public class Main {
    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        long a = sc.nextLong();
        long v = sc.nextLong();
        long b = sc.nextLong();
        long w = sc.nextLong();
        long t = sc.nextLong();

        if(Math.abs(a + v * t) - Math.abs(b + w * t) >= 0){
            System.out.println("YES");
        } else {
            System.out.println("NO");
        }
    }
    
}
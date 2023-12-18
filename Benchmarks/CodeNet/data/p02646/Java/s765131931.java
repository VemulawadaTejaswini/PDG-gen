
import java.util.Scanner;

public class Main {
    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        long a = sc.nextLong();
        long v = sc.nextLong();
        long b = sc.nextLong();
        long w = sc.nextLong();
        long t = sc.nextLong();

        if(a + v * t >= b + w * t){
            System.out.println("Yes");
        } else {
            System.out.println("No");
        }
    }
    
}
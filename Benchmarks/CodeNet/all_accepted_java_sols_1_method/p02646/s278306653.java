
import java.util.Scanner;

public class Main {
    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        long a = sc.nextLong();
        long v = sc.nextLong();
        long b = sc.nextLong();
        long w = sc.nextLong();
        long t = sc.nextLong();

        if(a <= b){
            if(a + v * t >= b + w * t){
                System.out.println("YES");
            } else {
                System.out.println("NO");
            }
    
        } else {
            if(a - v * t <= b - w * t){
                System.out.println("YES");
            } else {
                System.out.println("NO");
            }

        }
    }
    
}
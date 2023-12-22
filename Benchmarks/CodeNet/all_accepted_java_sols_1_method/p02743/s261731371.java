import java.util.Scanner;

public class Main {
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        long A = sc.nextLong();
        long B = sc.nextLong();
        long C = sc.nextLong();
        long fAB = 4*A*B;
        long CAB = C-A-B;
        if (CAB < 1 || CAB * CAB <= fAB) {
            System.out.println("No");
        } else {
            System.out.println("Yes");
        }
    }
}
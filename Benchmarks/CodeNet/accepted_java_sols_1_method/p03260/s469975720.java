import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int A, B;
        
        A = scan.nextInt();
        B = scan.nextInt();
        
        if ((A * B) % 2 == 0) {
            System.out.println("No");
        }
        else {
            System.out.println("Yes");
        }
    }
}

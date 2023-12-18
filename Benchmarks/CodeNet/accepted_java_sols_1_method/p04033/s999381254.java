import java.util.*;

public class Main {
    public static void main(String[] args) throws Exception {
        // Your code here!
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        
        int negacount = 0;
        if (a < 0) {
            if (b < 0) {
                negacount = (-a) - (-b) + 1;
                if (negacount % 2 == 0) {
                    System.out.println("Positive");
                    return;
                } else {
                    System.out.println("Negative");
                    return;
                }
            } else {
                System.out.println("Zero");
                return;
            }
        } else if (a == 0) {
            System.out.println("Zero");
        } else {
            System.out.println("Positive");
            return;
        }
    }
}

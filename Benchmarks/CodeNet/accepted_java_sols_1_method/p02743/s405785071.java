import java.util.*;

public class Main {
    public static void main(String[] args) throws Exception {
        Scanner in = new Scanner(System.in);
        
        long A = in.nextInt();
        long B = in.nextInt();
        long C = in.nextInt();
   
        long R = C - A - B;
        if (R < 0) {
            System.out.println("No");
        } else if (4 * A * B < R * R) {
            System.out.println("Yes");
        } else {
            System.out.println("No");
        }
    }
}
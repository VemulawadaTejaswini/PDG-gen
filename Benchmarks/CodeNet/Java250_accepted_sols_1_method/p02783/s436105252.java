import java.util.*;

public class Main {

    public static void main(String[] args) {
        Scanner stdIn = new Scanner(System.in);
        int H = stdIn.nextInt();
        int A = stdIn.nextInt();
        stdIn.close();

        int count = 0;
        if (H > A) {
            if (H % A == 0) {
                count = H / A;
            } else {
                count = H / A + 1;
            }
        } else {
            count = 1;
        }
        
        System.out.println(count);
    }
}
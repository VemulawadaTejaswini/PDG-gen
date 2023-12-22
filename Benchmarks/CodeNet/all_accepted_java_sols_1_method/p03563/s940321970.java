import java.util.Scanner;

public class Main {
    public static void main(String args[]) {
        try (Scanner in = new Scanner(System.in)) {
            int R = in.nextInt();
            int G = in.nextInt();
            // G=(R+X)/2.0;
            int X = 2 * G - R;
            System.out.println(X);
        }
    }
}

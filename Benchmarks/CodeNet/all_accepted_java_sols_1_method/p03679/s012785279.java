import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int X = in.nextInt();
        int A = in.nextInt();
        int B = in.nextInt();
        if (B <= A) {
            System.out.println("delicious");
        } else if (B - A <= X) {
            System.out.println("safe");
        } else {
            System.out.println("dangerous");
        }

    }
}
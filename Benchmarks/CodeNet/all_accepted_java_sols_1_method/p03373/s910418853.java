import java.util.Scanner;

public class Main {
    //C - Half and Half
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int A = scanner.nextInt();
        int B = scanner.nextInt();
        int C = scanner.nextInt();
        int X = scanner.nextInt();
        int Y = scanner.nextInt();

        int cost = 0;
        if ( X > Y ) {
            int dx = Math.abs(X - Y);
            cost = (X - dx) * Math.min(A+B, C*2) + dx * Math.min(A, C*2);
        }
        else {
            int dy = Math.abs(X - Y);
            cost = (Y - dy) * Math.min(A+B, C*2) + dy * Math.min(B, C*2);
        }
        System.out.println(cost);
    }
}

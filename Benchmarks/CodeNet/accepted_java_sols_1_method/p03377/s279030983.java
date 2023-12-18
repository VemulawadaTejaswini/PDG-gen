import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int A = scan.nextInt();
        int B = scan.nextInt();
        int X = scan.nextInt();
        if (X < A) {
            System.out.println("NO");
        } else if (X <= A + B) {
            System.out.println("YES");
        } else {
            System.out.println("NO");
        }
    }
}
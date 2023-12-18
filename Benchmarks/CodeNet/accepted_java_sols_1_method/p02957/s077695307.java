import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int A = sc.nextInt();
        int B = sc.nextInt();
        int AplusB = Math.abs(A+B);

        if (AplusB % 2 == 0) {
            System.out.println(AplusB / 2);
        } else {
            System.out.println("IMPOSSIBLE");
        }
    }
}

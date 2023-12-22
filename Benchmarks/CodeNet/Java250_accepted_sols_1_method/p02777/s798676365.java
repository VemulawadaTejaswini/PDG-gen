
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String S = sc.next();
        String T = sc.next();
        int A = sc.nextInt();
        int B = sc.nextInt();
        String N = sc.next();

        if (S.equals(N)) {
            A--;
        } else {
            B--;
        }
        System.out.println(A + " " + B);
    }
}
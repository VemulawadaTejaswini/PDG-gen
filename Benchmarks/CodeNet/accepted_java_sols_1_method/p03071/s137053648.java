import java.util.*;

public class Main {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        int A = sc.nextInt();
        int B = sc.nextInt();
        int sum = 0;
        int max = 0;
        if (A == B) {
            System.out.println(2 * A);
        } else{
            if (A > B) {
                sum = A;
                A--;
            } else {
                sum = B;
                B--;
            }
            if (A == B) {
                System.out.println(sum + A);
            } else if (A > B) {
                System.out.println(sum + A);
            } else {
                System.out.println(sum + B);
            }
        }
    }
}

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String[] ABC = sc.nextLine().split(" ");
        String A = ABC[0];
        String B = ABC[1];
        String C = ABC[2];

        boolean isAB = A.charAt(A.length() - 1) == B.charAt(0);
        boolean isBC = B.charAt(B.length() - 1) == C.charAt(0);
        if (isAB && isBC) {
            System.out.println("YES");
        } else {
            System.out.println("NO");
        }
    }
}

import java.util.*;


public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int A = sc.nextInt();
        int B = sc.nextInt();
        int C = sc.nextInt();

        if (A == B) {
            if (B == C) {
                System.out.println("No");
            } else {
                System.out.println("Yes");
            }
        } else if (B == C) {
            if (A == B) {
                System.out.println("No");
            } else {
                System.out.println("Yes");
            }
        } else if (A == C) {
            if (B == C) {
                System.out.println("No");
            } else {
                System.out.println("Yes");
            }
        } else {
            System.out.println("No");
        }

    }
}







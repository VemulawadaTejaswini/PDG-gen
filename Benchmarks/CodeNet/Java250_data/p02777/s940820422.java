import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            String S = sc.next();
            String T = sc.next();
            int A = sc.nextInt();
            int B = sc.nextInt();
            String U = sc.next();

            int a = S.equals(U) ? --A : A;
            int b = T.equals(U) ? --B : B;

            System.out.println(a + " " + b);
        }
    }

}
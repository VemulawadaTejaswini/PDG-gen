import java.util.Scanner;

/**
 * Main
 */
public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int A = sc.nextInt();
        int B = sc.nextInt();
        int C = sc.nextInt();

        int tmp = A;
        A = B;
        B = tmp;

        tmp = A;
        A = C;
        C = tmp;

        System.out.print(A + " ");
        System.out.print(B + " ");
        System.out.println(C);
        
    }
}
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int A = sc.nextInt();
        int B = sc.nextInt();
        int C = sc.nextInt();
        int D;

        D = A;
        A = B;
        B = D;

        D = A;
        A = C;
        C = D;

        System.out.print(A + " ");
        System.out.print(B + " ");
        System.out.print(C + " ");
    }
}
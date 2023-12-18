
import java.util.Scanner;

class Main {

    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int A = sc.nextInt();
        int B = sc.nextInt();
        int C = sc.nextInt();
        int D = sc.nextInt();
        int P = sc.nextInt();

        if (P <= C) {
            if (P * A >= B) {
                System.out.println(B);
            } else {
                System.out.println(P * A);
            }
        } else {
            if (P * A >= B + (P - C) * D) {
                System.out.println(B + (P - C) * D);
            } else {
                System.out.println(A * P);
            }
        }
    }

}


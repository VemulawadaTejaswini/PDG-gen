import java.util.Scanner;

class Main {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int A;
        int B;
        int C;
        int min;

        A = sc.nextInt();
        B = sc.nextInt();

        if (A > B) {
            C = A - B;
            min = B;
        } else {
            C = B - A;
            min = A;
        }

        if (C % 2 == 0) {
            System.out.println(C/2+min);
        } else {
            System.out.println("IMPOSSIBLE");
        }
    }
}

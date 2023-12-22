import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt(), A, B;
        if (N == 1) System.out.print("Hello World");
        else {
            A = sc.nextInt();
            B = sc.nextInt();
            System.out.print(A + B);
        }
        sc.close();
    }
}
import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int A = s.nextInt(), B = s.nextInt(), C = s.nextInt();
        int temp = A;
        A = B; B = temp;
        temp = A; A = C; C = temp;
        System.out.println(A + " " + B + " " + C);
    }
}
import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int A = sc.nextInt(), B = sc.nextInt();

        int result = 0;
        if (A >= 13) {
            result = B;
        } else if ( A >= 6 && A <= 12) {
            result = B / 2;
        } else {
            result = 0;
        }
        System.out.println(result);
    }
}
import java.util.Scanner;

class Main {
    private static final Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        final Integer A = sc.nextInt(),
                B = sc.nextInt(),
                C = sc.nextInt();
        if (A * B * C == 5 * 5 * 7) {
            System.out.println("YES");
        } else {
            System.out.println("NO");
        }
    }
}
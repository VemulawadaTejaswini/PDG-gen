import java.util.Scanner;

class A {
    public static void main(String... args) {
        final Scanner sc = new Scanner(System.in);
        final String S = sc.next().intern();
        final String T = sc.next().intern();
        final int A = sc.nextInt();
        final int B = sc.nextInt();
        final String U = sc.next().intern();
        if (S == U)
            System.out.printf("%d %d\n", A - 1, B);
        else
            System.out.printf("%d %d\n", A, B - 1);
    }
}

public class Main {
    public static void main(String... args) {
        A.main();
    }
}

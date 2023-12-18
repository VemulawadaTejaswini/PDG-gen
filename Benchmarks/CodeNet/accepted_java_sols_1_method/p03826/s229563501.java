import java.util.Scanner;

public class Main {

    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);

        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();
        int d = sc.nextInt();

        sc.close();

        int ab = a * b;
        int cd = c * d;

        if (ab > cd) {
            System.out.println(ab);
        } else if (ab < cd) {
            System.out.println(cd);
        } else {
            System.out.println(ab);
        }

    }
}
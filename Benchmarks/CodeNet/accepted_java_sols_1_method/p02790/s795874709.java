import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        sc.close();

        StringBuilder sb = new StringBuilder();

        for (int i = 0; i < b; i++) {
            sb.append(String.valueOf(a));
        }

        String A = sb.toString();
        sb.setLength(0);

        for (int i = 0; i < a; i++) {
            sb.append(String.valueOf(b));
        }
        String B = sb.toString();

        if (a >= b) {
            System.out.println(B);
        } else {
            System.out.println(A);
        }

    }

}
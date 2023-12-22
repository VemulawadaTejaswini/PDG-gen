import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);

        int P = sc.nextInt();
        int Q = sc.nextInt();
        int R = sc.nextInt();

        System.out.println(Math.min(Math.min(P + Q, P + R), Q + R));

    }
}
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int A = Integer.parseInt(sc.next());
        int B = Integer.parseInt(sc.next());

        if (A >= 10 || B >= 10) {
            System.out.println(-1);
        } else {
            System.out.println(A * B);
        }

    }
}
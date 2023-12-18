import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int A = s.nextInt();
        int P = s.nextInt();
        P = P + (A*3);
        System.out.println(P/2);
    }
}
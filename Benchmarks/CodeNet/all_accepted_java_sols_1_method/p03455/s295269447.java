import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        String token1 = sc.next();
        String token2 = sc.next();

        int result = Integer.parseInt(token1) * Integer.parseInt(token2);

        if (result % 2 != 0) {
            System.out.println("Odd");
        } else {
            System.out.println("Even");
        }

        sc.close();
    }
}

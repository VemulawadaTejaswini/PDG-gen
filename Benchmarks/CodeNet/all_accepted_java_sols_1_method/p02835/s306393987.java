import java.util.*;

public class Main {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        int a1 = sc.nextInt();
        int a2 = sc.nextInt();
        int a3 = sc.nextInt();

        if (a1 + a2 + a3 <= 21) {
            System.out.println("win");
        } else {
            System.out.println("bust");
        }
    }
}

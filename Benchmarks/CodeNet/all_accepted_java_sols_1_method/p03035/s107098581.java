import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int A = sc.nextInt();
        int B = sc.nextInt();
        sc.close();
        if (A >= 13) {
            System.out.println(B);
        } else if (A <= 5) {
            System.out.println("0");
        } else {
            System.out.println(B / 2);
        }
    }
}

import java.util.*;

public class Main {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        sc.close();

        if (a < 10 && b < 10) {
            System.out.println(a * b);
        } else {
            System.out.println(-1);
        }
    }
}
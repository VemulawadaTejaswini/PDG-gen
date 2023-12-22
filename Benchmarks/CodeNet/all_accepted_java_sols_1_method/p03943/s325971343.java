import java.util.Scanner;

public class Main {

    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);

        long a = sc.nextLong();
        long b = sc.nextLong();
        long c = sc.nextLong();

        sc.close();

        boolean flg = false;

        if (a + b == c || a + c == b || b + c == a) {
            flg = true;
        }

        System.out.println(flg ? "Yes" : "No");

    }
}
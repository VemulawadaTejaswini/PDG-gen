import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int n, res;
        Scanner sc = new Scanner(System.in);
        n = sc.nextInt();
        if (n % 1000 != 0) {
            res = 1000 - n % 1000;
            System.out.println(res);

        } else System.out.println("0");

    }
}

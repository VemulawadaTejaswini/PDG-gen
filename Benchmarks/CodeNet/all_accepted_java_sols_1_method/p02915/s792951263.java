import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = Integer.parseInt(sc.next());
        if (n == 1) {
            System.out.println(n);
        } else {
            System.out.println((int) Math.pow(n, 3));
        }
        sc.close();
    }
}

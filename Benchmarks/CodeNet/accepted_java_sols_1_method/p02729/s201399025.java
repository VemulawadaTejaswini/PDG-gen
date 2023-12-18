import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = Integer.parseInt(sc.next());
        int m = Integer.parseInt(sc.next());
        int even = n * (n - 1) / 2;
        int odd = m * (m - 1) / 2;
        System.out.println(even + odd);
    }
}
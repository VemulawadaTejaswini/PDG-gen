import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int v = n;

        int z = v % 10;
        while (v >= 10) {
            v /= 10;
            z += v % 10;
        }

        System.out.print(n % z == 0 ? "Yes" : "No");
    }
}

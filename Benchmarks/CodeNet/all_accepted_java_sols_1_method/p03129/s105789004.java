import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int K = sc.nextInt();
        if ((2 * K - 1) <= N) {
            System.out.println("YES");
        } else {
            System.out.println("NO");
        }
    }
}

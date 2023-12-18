import java.util.Scanner;

/**
 *
 * @author psygn
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int N = scanner.nextInt();
        int K = scanner.nextInt();
        String str = scanner.nextLine();
        int ans = (N - 1) / (K - 1);
        if ((N - 1) % (K - 1) > 0) {
            ans += 1;

        }
        System.out.println(ans);
    }
}
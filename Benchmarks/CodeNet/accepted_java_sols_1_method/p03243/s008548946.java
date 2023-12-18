import java.util.Scanner;

/**
 * ABC111B
 */
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();

        for (int i = 1; i <= 9; i++) {
            if ((N / (i * 111) == 1 && N % (i * 111) == 0) || (N / (i * 111) == 0)) {
                System.out.println(i * 111);
                break;
            }
        }

        sc.close();
    }
}
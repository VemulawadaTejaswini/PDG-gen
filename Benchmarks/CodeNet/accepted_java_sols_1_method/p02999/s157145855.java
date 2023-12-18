import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        final int X = sc.nextInt();
        final int A = sc.nextInt();

        System.out.println(X >= A ? 10 : 0);
    }
}

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int K = in.nextInt();
        int X = in.nextInt();
        System.out.println(500*K >= X ? "Yes" : "No");
    }
}

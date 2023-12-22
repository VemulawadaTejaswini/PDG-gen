import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int N = scan.nextInt();
        int H = scan.nextInt();
        int W = scan.nextInt();
        scan.close();

        int Ans = (N - W + 1) * (N - H + 1);

        System.out.println(Ans);

    }
}
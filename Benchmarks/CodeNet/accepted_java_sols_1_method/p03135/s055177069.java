import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int T = scan.nextInt();
        int X = scan.nextInt();
        double ans = (double)T/(double)X;
        scan.close();
            System.out.println(ans);

    }
}
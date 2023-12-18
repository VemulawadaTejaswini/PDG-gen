import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int A = sc.nextInt();
        int B = sc.nextInt();
        int C = sc.nextInt();

        int AminusB = A - B;

        int ans = C <= AminusB ? 0 : C - AminusB;
        System.out.println(ans);
    }
}

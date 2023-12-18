import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int A = sc.nextInt();
        int B = sc.nextInt();
        int T = sc.nextInt();
        int cnt = 0;

        cnt = T / A * B;

        System.out.println(cnt);
    }
}

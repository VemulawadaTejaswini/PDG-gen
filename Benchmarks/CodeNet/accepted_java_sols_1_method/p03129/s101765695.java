import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        // N,Kの読み取り
        Scanner scan = new Scanner(System.in);
        int N = scan.nextInt();
        int K = scan.nextInt();

        int result = N / 2 + N % 2;

        if (result >= K) {
            System.out.print("YES");
        } else {
            System.out.print("NO");
        }
    }

}

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int N = scan.nextInt();
        int K = scan.nextInt();
        String result = (N / 2 + N % 2 >= K) ? "YES" : "NO";
        System.out.print(result);
    }
}
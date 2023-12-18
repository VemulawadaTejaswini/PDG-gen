import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int M = sc.nextInt();
        int ans = (int) ((100 * (N - M) + 1900 * M) * Math.pow(2, M));
        System.out.println(ans);
    }

}
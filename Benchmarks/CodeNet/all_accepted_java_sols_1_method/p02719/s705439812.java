import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Long N, K;
        Scanner sc = new Scanner(System.in);
        N = sc.nextLong();
        K = sc.nextLong();
        Long check = Math.min((N%K),(K-N%K));
        System.out.println(check);
    }
}

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = Integer.parseInt(sc.next());
        int sum = 0;
        boolean isOdd = N % 2 == 0;
        for (int i = 1; i <= N / 2; i++) {
            if (isOdd && i == N / 2) {
            } else {
                sum++;
            }
        }
        System.out.println(sum);
    }
}
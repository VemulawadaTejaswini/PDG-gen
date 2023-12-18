import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int K = scan.nextInt();
        String sevensNum = "7";
        String num = "7";

        for (int i = 1; i < K; i++) {
            if (Integer.parseInt(num) % K == 0) {
                System.out.println(num);
                return;
            }
            num = num + sevensNum;
        }
    }
}
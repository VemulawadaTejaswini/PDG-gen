import java.util.Scanner;

public class Main {

    private static Scanner input = new Scanner(System.in);

    public static void main(String[] args) {
        int K;
        String S;

        K = Integer.parseInt(input.nextLine());
        S = input.nextLine();

        System.out.println(S.substring(0,K) + "...");
    }
}

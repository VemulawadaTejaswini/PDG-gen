import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int K = Integer.parseInt(scanner.nextLine());
        String S = scanner.nextLine();
        if (K > S.length()) {
            System.out.println(S);
        } else {
            String s = S.substring(0,K);
            System.out.println(s + "...");
        }
    }
}

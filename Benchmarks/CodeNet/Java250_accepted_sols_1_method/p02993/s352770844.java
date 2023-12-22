import java.util.Scanner;

public class Main {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        String code = sc.nextLine().replace("\n", "");
        sc.close();

        for (int i = 1; i < code.length(); i++) {
            if (code.charAt(i - 1) == code.charAt(i)) {
                System.out.println("Bad");
                System.exit(0);
            }
        }
        System.out.println("Good");
    }
}

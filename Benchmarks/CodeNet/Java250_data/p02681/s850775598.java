import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        String S = sc.nextLine(), T = sc.nextLine();
        String result = T.startsWith(S) ? "Yes" : "No";

        System.out.println(result);
    }
}
